/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.hdr.model.v20170925;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.hdr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CollectCustomerInfoRequest extends RpcAcsRequest<CollectCustomerInfoResponse> {
	
	public CollectCustomerInfoRequest() {
		super("hdr", "2017-09-25", "CollectCustomerInfo", "hdr");
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String value6;

	private String value5;

	private String value8;

	private String value7;

	private String value2;

	private String value1;

	private String value4;

	private String value3;

	private String telephone;

	private String label1;

	private String value9;

	private String label2;

	private String label3;

	private String label4;

	private String label5;

	private String label6;

	private String label7;

	private String label8;

	private String label9;

	private String service;

	private String contact;

	private String company;

	public String getValue6() {
		return this.value6;
	}

	public void setValue6(String value6) {
		this.value6 = value6;
		if(value6 != null){
			putQueryParameter("Value6", value6);
		}
	}

	public String getValue5() {
		return this.value5;
	}

	public void setValue5(String value5) {
		this.value5 = value5;
		if(value5 != null){
			putQueryParameter("Value5", value5);
		}
	}

	public String getValue8() {
		return this.value8;
	}

	public void setValue8(String value8) {
		this.value8 = value8;
		if(value8 != null){
			putQueryParameter("Value8", value8);
		}
	}

	public String getValue7() {
		return this.value7;
	}

	public void setValue7(String value7) {
		this.value7 = value7;
		if(value7 != null){
			putQueryParameter("Value7", value7);
		}
	}

	public String getValue2() {
		return this.value2;
	}

	public void setValue2(String value2) {
		this.value2 = value2;
		if(value2 != null){
			putQueryParameter("Value2", value2);
		}
	}

	public String getValue1() {
		return this.value1;
	}

	public void setValue1(String value1) {
		this.value1 = value1;
		if(value1 != null){
			putQueryParameter("Value1", value1);
		}
	}

	public String getValue4() {
		return this.value4;
	}

	public void setValue4(String value4) {
		this.value4 = value4;
		if(value4 != null){
			putQueryParameter("Value4", value4);
		}
	}

	public String getValue3() {
		return this.value3;
	}

	public void setValue3(String value3) {
		this.value3 = value3;
		if(value3 != null){
			putQueryParameter("Value3", value3);
		}
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
		if(telephone != null){
			putQueryParameter("Telephone", telephone);
		}
	}

	public String getLabel1() {
		return this.label1;
	}

	public void setLabel1(String label1) {
		this.label1 = label1;
		if(label1 != null){
			putQueryParameter("Label1", label1);
		}
	}

	public String getValue9() {
		return this.value9;
	}

	public void setValue9(String value9) {
		this.value9 = value9;
		if(value9 != null){
			putQueryParameter("Value9", value9);
		}
	}

	public String getLabel2() {
		return this.label2;
	}

	public void setLabel2(String label2) {
		this.label2 = label2;
		if(label2 != null){
			putQueryParameter("Label2", label2);
		}
	}

	public String getLabel3() {
		return this.label3;
	}

	public void setLabel3(String label3) {
		this.label3 = label3;
		if(label3 != null){
			putQueryParameter("Label3", label3);
		}
	}

	public String getLabel4() {
		return this.label4;
	}

	public void setLabel4(String label4) {
		this.label4 = label4;
		if(label4 != null){
			putQueryParameter("Label4", label4);
		}
	}

	public String getLabel5() {
		return this.label5;
	}

	public void setLabel5(String label5) {
		this.label5 = label5;
		if(label5 != null){
			putQueryParameter("Label5", label5);
		}
	}

	public String getLabel6() {
		return this.label6;
	}

	public void setLabel6(String label6) {
		this.label6 = label6;
		if(label6 != null){
			putQueryParameter("Label6", label6);
		}
	}

	public String getLabel7() {
		return this.label7;
	}

	public void setLabel7(String label7) {
		this.label7 = label7;
		if(label7 != null){
			putQueryParameter("Label7", label7);
		}
	}

	public String getLabel8() {
		return this.label8;
	}

	public void setLabel8(String label8) {
		this.label8 = label8;
		if(label8 != null){
			putQueryParameter("Label8", label8);
		}
	}

	public String getLabel9() {
		return this.label9;
	}

	public void setLabel9(String label9) {
		this.label9 = label9;
		if(label9 != null){
			putQueryParameter("Label9", label9);
		}
	}

	public String getService() {
		return this.service;
	}

	public void setService(String service) {
		this.service = service;
		if(service != null){
			putQueryParameter("Service", service);
		}
	}

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
		if(contact != null){
			putQueryParameter("Contact", contact);
		}
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
		if(company != null){
			putQueryParameter("Company", company);
		}
	}

	@Override
	public Class<CollectCustomerInfoResponse> getResponseClass() {
		return CollectCustomerInfoResponse.class;
	}

}
