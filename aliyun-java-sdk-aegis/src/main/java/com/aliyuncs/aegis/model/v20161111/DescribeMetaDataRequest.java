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

package com.aliyuncs.aegis.model.v20161111;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeMetaDataRequest extends RpcAcsRequest<DescribeMetaDataResponse> {
	
	public DescribeMetaDataRequest() {
		super("aegis", "2016-11-11", "DescribeMetaData", "vipaegis");
	}

	private String projectName;

	private String logStoreName;

	private String regionNo;

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putQueryParameter("ProjectName", projectName);
		}
	}

	public String getLogStoreName() {
		return this.logStoreName;
	}

	public void setLogStoreName(String logStoreName) {
		this.logStoreName = logStoreName;
		if(logStoreName != null){
			putQueryParameter("LogStoreName", logStoreName);
		}
	}

	public String getRegionNo() {
		return this.regionNo;
	}

	public void setRegionNo(String regionNo) {
		this.regionNo = regionNo;
		if(regionNo != null){
			putQueryParameter("RegionNo", regionNo);
		}
	}

	@Override
	public Class<DescribeMetaDataResponse> getResponseClass() {
		return DescribeMetaDataResponse.class;
	}

}
