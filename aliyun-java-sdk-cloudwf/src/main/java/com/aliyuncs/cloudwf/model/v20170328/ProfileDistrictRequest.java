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

package com.aliyuncs.cloudwf.model.v20170328;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ProfileDistrictRequest extends RpcAcsRequest<ProfileDistrictResponse> {
	
	public ProfileDistrictRequest() {
		super("cloudwf", "2017-03-28", "ProfileDistrict", "cloudwf");
	}

	private String beginDate;

	private String endDate;

	private Integer dataType;

	private Long gsid;

	public String getBeginDate() {
		return this.beginDate;
	}

	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
		if(beginDate != null){
			putQueryParameter("BeginDate", beginDate);
		}
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
		if(endDate != null){
			putQueryParameter("EndDate", endDate);
		}
	}

	public Integer getDataType() {
		return this.dataType;
	}

	public void setDataType(Integer dataType) {
		this.dataType = dataType;
		if(dataType != null){
			putQueryParameter("DataType", dataType.toString());
		}
	}

	public Long getGsid() {
		return this.gsid;
	}

	public void setGsid(Long gsid) {
		this.gsid = gsid;
		if(gsid != null){
			putQueryParameter("Gsid", gsid.toString());
		}
	}

	@Override
	public Class<ProfileDistrictResponse> getResponseClass() {
		return ProfileDistrictResponse.class;
	}

}
