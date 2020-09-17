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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetLinkeLinklogKnowledgefeedbacklistRequest extends RpcAcsRequest<GetLinkeLinklogKnowledgefeedbacklistResponse> {
	   

	private String endText;

	private String beginText;

	private String feedback;

	private Long end;

	private List<String> fieldsRepeatLists;

	private Long storeIds;

	private List<String> listRepeatLists;

	private List<String> dataRepeatLists;

	private Long begin;
	public GetLinkeLinklogKnowledgefeedbacklistRequest() {
		super("SOFA", "2019-08-15", "GetLinkeLinklogKnowledgefeedbacklist", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getEndText() {
		return this.endText;
	}

	public void setEndText(String endText) {
		this.endText = endText;
		if(endText != null){
			putBodyParameter("EndText", endText);
		}
	}

	public String getBeginText() {
		return this.beginText;
	}

	public void setBeginText(String beginText) {
		this.beginText = beginText;
		if(beginText != null){
			putBodyParameter("BeginText", beginText);
		}
	}

	public String getFeedback() {
		return this.feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
		if(feedback != null){
			putBodyParameter("Feedback", feedback);
		}
	}

	public Long getEnd() {
		return this.end;
	}

	public void setEnd(Long end) {
		this.end = end;
		if(end != null){
			putBodyParameter("End", end.toString());
		}
	}

	public List<String> getFieldsRepeatLists() {
		return this.fieldsRepeatLists;
	}

	public void setFieldsRepeatLists(List<String> fieldsRepeatLists) {
		this.fieldsRepeatLists = fieldsRepeatLists;	
		if (fieldsRepeatLists != null) {
			for (int i = 0; i < fieldsRepeatLists.size(); i++) {
				putBodyParameter("FieldsRepeatList." + (i + 1) , fieldsRepeatLists.get(i));
			}
		}	
	}

	public Long getStoreIds() {
		return this.storeIds;
	}

	public void setStoreIds(Long storeIds) {
		this.storeIds = storeIds;
		if(storeIds != null){
			putBodyParameter("StoreIds", storeIds.toString());
		}
	}

	public List<String> getListRepeatLists() {
		return this.listRepeatLists;
	}

	public void setListRepeatLists(List<String> listRepeatLists) {
		this.listRepeatLists = listRepeatLists;	
		if (listRepeatLists != null) {
			for (int i = 0; i < listRepeatLists.size(); i++) {
				putBodyParameter("ListRepeatList." + (i + 1) , listRepeatLists.get(i));
			}
		}	
	}

	public List<String> getDataRepeatLists() {
		return this.dataRepeatLists;
	}

	public void setDataRepeatLists(List<String> dataRepeatLists) {
		this.dataRepeatLists = dataRepeatLists;	
		if (dataRepeatLists != null) {
			for (int i = 0; i < dataRepeatLists.size(); i++) {
				putBodyParameter("DataRepeatList." + (i + 1) , dataRepeatLists.get(i));
			}
		}	
	}

	public Long getBegin() {
		return this.begin;
	}

	public void setBegin(Long begin) {
		this.begin = begin;
		if(begin != null){
			putBodyParameter("Begin", begin.toString());
		}
	}

	@Override
	public Class<GetLinkeLinklogKnowledgefeedbacklistResponse> getResponseClass() {
		return GetLinkeLinklogKnowledgefeedbacklistResponse.class;
	}

}
