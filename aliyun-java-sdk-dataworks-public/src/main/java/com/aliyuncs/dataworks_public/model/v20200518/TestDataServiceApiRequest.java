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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class TestDataServiceApiRequest extends RpcAcsRequest<TestDataServiceApiResponse> {
	   

	private List<PathParams> pathParamss;

	private String bodyContent;

	private List<BodyParams> bodyParamss;

	private List<QueryParam> queryParams;

	private List<HeadParams> headParamss;

	private Long apiId;
	public TestDataServiceApiRequest() {
		super("dataworks-public", "2020-05-18", "TestDataServiceApi");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<PathParams> getPathParamss() {
		return this.pathParamss;
	}

	public void setPathParamss(List<PathParams> pathParamss) {
		this.pathParamss = pathParamss;	
		if (pathParamss != null) {
			for (int depth1 = 0; depth1 < pathParamss.size(); depth1++) {
				putBodyParameter("PathParams." + (depth1 + 1) + ".ParamKey" , pathParamss.get(depth1).getParamKey());
				putBodyParameter("PathParams." + (depth1 + 1) + ".ParamValue" , pathParamss.get(depth1).getParamValue());
			}
		}	
	}

	public String getBodyContent() {
		return this.bodyContent;
	}

	public void setBodyContent(String bodyContent) {
		this.bodyContent = bodyContent;
		if(bodyContent != null){
			putBodyParameter("BodyContent", bodyContent);
		}
	}

	public List<BodyParams> getBodyParamss() {
		return this.bodyParamss;
	}

	public void setBodyParamss(List<BodyParams> bodyParamss) {
		this.bodyParamss = bodyParamss;	
		if (bodyParamss != null) {
			for (int depth1 = 0; depth1 < bodyParamss.size(); depth1++) {
				putBodyParameter("BodyParams." + (depth1 + 1) + ".ParamKey" , bodyParamss.get(depth1).getParamKey());
				putBodyParameter("BodyParams." + (depth1 + 1) + ".ParamValue" , bodyParamss.get(depth1).getParamValue());
			}
		}	
	}

	public List<QueryParam> getQueryParams() {
		return this.queryParams;
	}

	public void setQueryParams(List<QueryParam> queryParams) {
		this.queryParams = queryParams;	
		if (queryParams != null) {
			for (int depth1 = 0; depth1 < queryParams.size(); depth1++) {
				putBodyParameter("QueryParam." + (depth1 + 1) + ".ParamKey" , queryParams.get(depth1).getParamKey());
				putBodyParameter("QueryParam." + (depth1 + 1) + ".ParamValue" , queryParams.get(depth1).getParamValue());
			}
		}	
	}

	public List<HeadParams> getHeadParamss() {
		return this.headParamss;
	}

	public void setHeadParamss(List<HeadParams> headParamss) {
		this.headParamss = headParamss;	
		if (headParamss != null) {
			for (int depth1 = 0; depth1 < headParamss.size(); depth1++) {
				putBodyParameter("HeadParams." + (depth1 + 1) + ".ParamKey" , headParamss.get(depth1).getParamKey());
				putBodyParameter("HeadParams." + (depth1 + 1) + ".ParamValue" , headParamss.get(depth1).getParamValue());
			}
		}	
	}

	public Long getApiId() {
		return this.apiId;
	}

	public void setApiId(Long apiId) {
		this.apiId = apiId;
		if(apiId != null){
			putQueryParameter("ApiId", apiId.toString());
		}
	}

	public static class PathParams {

		private String paramKey;

		private String paramValue;

		public String getParamKey() {
			return this.paramKey;
		}

		public void setParamKey(String paramKey) {
			this.paramKey = paramKey;
		}

		public String getParamValue() {
			return this.paramValue;
		}

		public void setParamValue(String paramValue) {
			this.paramValue = paramValue;
		}
	}

	public static class BodyParams {

		private String paramKey;

		private String paramValue;

		public String getParamKey() {
			return this.paramKey;
		}

		public void setParamKey(String paramKey) {
			this.paramKey = paramKey;
		}

		public String getParamValue() {
			return this.paramValue;
		}

		public void setParamValue(String paramValue) {
			this.paramValue = paramValue;
		}
	}

	public static class QueryParam {

		private String paramKey;

		private String paramValue;

		public String getParamKey() {
			return this.paramKey;
		}

		public void setParamKey(String paramKey) {
			this.paramKey = paramKey;
		}

		public String getParamValue() {
			return this.paramValue;
		}

		public void setParamValue(String paramValue) {
			this.paramValue = paramValue;
		}
	}

	public static class HeadParams {

		private String paramKey;

		private String paramValue;

		public String getParamKey() {
			return this.paramKey;
		}

		public void setParamKey(String paramKey) {
			this.paramKey = paramKey;
		}

		public String getParamValue() {
			return this.paramValue;
		}

		public void setParamValue(String paramValue) {
			this.paramValue = paramValue;
		}
	}

	@Override
	public Class<TestDataServiceApiResponse> getResponseClass() {
		return TestDataServiceApiResponse.class;
	}

}
