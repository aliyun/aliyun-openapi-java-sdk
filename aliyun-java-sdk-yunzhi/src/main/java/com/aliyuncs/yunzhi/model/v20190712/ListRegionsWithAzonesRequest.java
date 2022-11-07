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

package com.aliyuncs.yunzhi.model.v20190712;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListRegionsWithAzonesRequest extends RpcAcsRequest<ListRegionsWithAzonesResponse> {
	   

	private Operator operator;

	private Param param;
	public ListRegionsWithAzonesRequest() {
		super("YunZhi", "2019-07-12", "ListRegionsWithAzones");
		setMethod(MethodType.GET);
	}

	public Operator getOperator() {
		return this.operator;
	}

	public void setOperator(Operator operator) {
		this.operator = operator;	
		if (operator != null) {
			
				putQueryParameter("Operator.WorkId" , operator.getWorkId());
		}	
	}

	public Param getParam() {
		return this.param;
	}

	public void setParam(Param param) {
		this.param = param;	
		if (param != null) {
			
				if (param.getCloudPlatformCodes() != null) {
					for (int depth1 = 0; depth1 < param.getCloudPlatformCodes().size(); depth1++) {
						putQueryParameter("Param.CloudPlatformCodes." + (depth1 + 1) , param.getCloudPlatformCodes().get(depth1));
					}
				}
		}	
	}

	public static class Operator {

		private String workId;

		public String getWorkId() {
			return this.workId;
		}

		public void setWorkId(String workId) {
			this.workId = workId;
		}
	}

	public static class Param {

		private List<String> cloudPlatformCodes;

		public List<String> getCloudPlatformCodes() {
			return this.cloudPlatformCodes;
		}

		public void setCloudPlatformCodes(List<String> cloudPlatformCodes) {
			this.cloudPlatformCodes = cloudPlatformCodes;
		}
	}

	@Override
	public Class<ListRegionsWithAzonesResponse> getResponseClass() {
		return ListRegionsWithAzonesResponse.class;
	}

}
