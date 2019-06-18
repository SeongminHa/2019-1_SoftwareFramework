package lab;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductController {

	@Resource(name="productService")
	ProductServiceImpl ps;
	
	@RequestMapping(value="/insert.do",method=RequestMethod.GET)
	public String insertForm(Model mo) {
		ProductVO vo=new ProductVO();
		mo.addAttribute("productVO",vo);
		return "insert/insertForm";		
	}
	@RequestMapping(value="/insert.do", method=RequestMethod.POST)
	public String insertformPOST(@ModelAttribute("productVO") ProductVO vo, Model mo){
		try {
			ps.insertProduct(vo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "/insert/insert";
	}
	@RequestMapping(value="/update.do",method=RequestMethod.GET)
	public String updateForm(Model mo) {
		ProductVO vo=new ProductVO();
		mo.addAttribute("productVO",vo);
		return "update/updateForm";		
	}
	@RequestMapping(value="/update.do", method=RequestMethod.POST)
	public String updateformPOST(@ModelAttribute("productVO") ProductVO vo, Model mo){
		try {
			ps.updateProduct(vo);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "/update/update";
	}
	@RequestMapping(value="/delete.do",method=RequestMethod.GET)
	public String deleteForm(Model mo){
		ProductVO vo=new ProductVO();
		mo.addAttribute("productVO",vo);
		return "/delete/deleteForm";
	}
	@RequestMapping(value="/delete.do", method=RequestMethod.POST)
	public String deleteformPOST(@ModelAttribute("productVO") ProductVO vo, Model mo){
		try {
			ps.deleteProduct(vo);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "/delete/delete";
	}
	@RequestMapping(value="/select.do",method=RequestMethod.GET)
	public String selectForm(Model mo){
		ProductVO vo=new ProductVO();
		mo.addAttribute("productVO", vo);
		return "/select/selectForm";
	}
	@RequestMapping(value="/select.do", method=RequestMethod.POST)
	public String selectformPOST(@ModelAttribute("productVO") ProductVO vo, Model mo){
		try{
			ProductVO pvo=ps.selectProduct(vo);
			mo.addAttribute("pvo",pvo);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "/select/select";
	}
	@RequestMapping(value="/selectList.do",method=RequestMethod.GET)
	public String selectListForm(Model mo){
		ProductVO vo=new ProductVO();
		mo.addAttribute("productVO", vo);
		return "/select/selectListForm";
	}
	@RequestMapping(value="/selectList.do", method=RequestMethod.POST)
	public String selectListformPOST(@ModelAttribute("productVO") ProductVO vo, Model mo){
		try{
			List<ProductVO> pvo=ps.selectProductList(vo);
			mo.addAttribute("pvo", pvo);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "/select/selectList";
	}
	@RequestMapping(value="/selectLike.do",method=RequestMethod.GET)
	public String selectLikeFormPOST(Model mo){
		ProductVO vo=new ProductVO();
		mo.addAttribute("productVO", vo);
		return "/select/selectLikeForm";
	}
	@RequestMapping(value="/selectLike.do", method=RequestMethod.POST)
	public String selectLikeformPOST(@ModelAttribute("productVO") ProductVO vo, Model mo){
		try{
			List<ProductVO> pvo=ps.selectProductLike(vo);
			mo.addAttribute("pvo", pvo);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "/select/selectLike";
	}
}


