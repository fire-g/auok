//package edu.appointment.rest;
//
//import java.util.Collection;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import edu.appointment.model.doctor;
//import edu.appointment.service.ClinicService;
//
//
//@CrossOrigin
//@RestController
//@RequestMapping("api/v1/doctor")
//public class doctorRestController {
//
//	@Autowired
//	ClinicService clinicService;
//	
//	@RequestMapping(value="",method = RequestMethod.GET,produces="application/json")
//	public ResponseEntity<Collection<doctor>> doctors(){
//		Collection<doctor> doctors = clinicService.getAllDoctor();
//		return new ResponseEntity<Collection<doctor>>(doctors,HttpStatus.OK);
//	}
//	
//	@RequestMapping(value="/{id}",method = RequestMethod.GET,produces="application/json")
//	public ResponseEntity<doctor> doctor(int id){
//		doctor doctor = clinicService.getDoctorById(id);
//		return new ResponseEntity<doctor>(doctor,HttpStatus.OK);
//	}
//	
//	@RequestMapping(value="/maxpatient",method = RequestMethod.POST,produces="application/json")
//	public ResponseEntity<doctor> setMaxpatient(@RequestBody int id,int maxpatient){
//		clinicService.setMaxpatient(id, maxpatient);
//		return new ResponseEntity<>(HttpStatus.CREATED);
//	}
//}
