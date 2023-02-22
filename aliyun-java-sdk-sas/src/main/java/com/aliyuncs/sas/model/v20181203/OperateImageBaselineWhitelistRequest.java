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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OperateImageBaselineWhitelistRequest extends RpcAcsRequest<OperateImageBaselineWhitelistResponse> {
	   

	private String imageUuid;

	private String baselineItemKeyList;

	private List<String> scanRanges;

	private String lang;

	private String operation;
	public OperateImageBaselineWhitelistRequest() {
		super("Sas", "2018-12-03", "OperateImageBaselineWhitelist");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getImageUuid() {
		return this.imageUuid;
	}

	public void setImageUuid(String imageUuid) {
		this.imageUuid = imageUuid;
		if(imageUuid != null){
			putQueryParameter("ImageUuid", imageUuid);
		}
	}

	public String getBaselineItemKeyList() {
		return this.baselineItemKeyList;
	}

	public void setBaselineItemKeyList(String baselineItemKeyList) {
		this.baselineItemKeyList = baselineItemKeyList;
		if(baselineItemKeyList != null){
			putQueryParameter("BaselineItemKeyList", baselineItemKeyList);
		}
	}

	public List<String> getScanRanges() {
		return this.scanRanges;
	}

	public void setScanRanges(List<String> scanRanges) {
		this.scanRanges = scanRanges;	
		if (scanRanges != null) {
			for (int i = 0; i < scanRanges.size(); i++) {
				putQueryParameter("ScanRange." + (i + 1) , scanRanges.get(i));
			}
		}	
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public String getOperation() {
		return this.operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
		if(operation != null){
			putQueryParameter("Operation", operation);
		}
	}

	@Override
	public Class<OperateImageBaselineWhitelistResponse> getResponseClass() {
		return OperateImageBaselineWhitelistResponse.class;
	}

}
