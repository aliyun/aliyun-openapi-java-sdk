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

package com.aliyuncs.imageprocess.model.v20200320;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.imageprocess.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SegmentOARRequest extends RpcAcsRequest<SegmentOARResponse> {
	   

	private String orgName;

	private String bodyPart;

	private String dataFormat;

	private List<URLList> uRLLists;

	private String orgId;

	private Boolean contrast;

	private List<Long> maskLists;
	public SegmentOARRequest() {
		super("imageprocess", "2020-03-20", "SegmentOAR", "imageprocess");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOrgName() {
		return this.orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
		if(orgName != null){
			putBodyParameter("OrgName", orgName);
		}
	}

	public String getBodyPart() {
		return this.bodyPart;
	}

	public void setBodyPart(String bodyPart) {
		this.bodyPart = bodyPart;
		if(bodyPart != null){
			putBodyParameter("BodyPart", bodyPart);
		}
	}

	public String getDataFormat() {
		return this.dataFormat;
	}

	public void setDataFormat(String dataFormat) {
		this.dataFormat = dataFormat;
		if(dataFormat != null){
			putBodyParameter("DataFormat", dataFormat);
		}
	}

	public List<URLList> getURLLists() {
		return this.uRLLists;
	}

	public void setURLLists(List<URLList> uRLLists) {
		this.uRLLists = uRLLists;	
		if (uRLLists != null) {
			for (int depth1 = 0; depth1 < uRLLists.size(); depth1++) {
				putBodyParameter("URLList." + (depth1 + 1) + ".URL" , uRLLists.get(depth1).getURL());
			}
		}	
	}

	public String getOrgId() {
		return this.orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
		if(orgId != null){
			putBodyParameter("OrgId", orgId);
		}
	}

	public Boolean getContrast() {
		return this.contrast;
	}

	public void setContrast(Boolean contrast) {
		this.contrast = contrast;
		if(contrast != null){
			putBodyParameter("Contrast", contrast.toString());
		}
	}

	public List<Long> getMaskLists() {
		return this.maskLists;
	}

	public void setMaskLists(List<Long> maskLists) {
		this.maskLists = maskLists;	
		if (maskLists != null) {
			for (int i = 0; i < maskLists.size(); i++) {
				putBodyParameter("MaskList." + (i + 1) , maskLists.get(i));
			}
		}	
	}

	public static class URLList {

		private String uRL;

		public String getURL() {
			return this.uRL;
		}

		public void setURL(String uRL) {
			this.uRL = uRL;
		}
	}

	@Override
	public Class<SegmentOARResponse> getResponseClass() {
		return SegmentOARResponse.class;
	}

}
