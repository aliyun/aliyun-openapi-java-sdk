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

package com.aliyuncs.retailbot.model.v20210224;

import com.aliyuncs.RpcAcsRequest;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListSubscriptionByPackageRequest extends RpcAcsRequest<ListSubscriptionByPackageResponse> {
	   

	@SerializedName("packageDTO")
	private PackageDTO packageDTO;

	@SerializedName("pageData")
	private PageData pageData;
	public ListSubscriptionByPackageRequest() {
		super("RetailBot", "2021-02-24", "ListSubscriptionByPackage");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public PackageDTO getPackageDTO() {
		return this.packageDTO;
	}

	public void setPackageDTO(PackageDTO packageDTO) {
		this.packageDTO = packageDTO;	
		if (packageDTO != null) {
			putBodyParameter("PackageDTO" , new Gson().toJson(packageDTO));
		}	
	}

	public PageData getPageData() {
		return this.pageData;
	}

	public void setPageData(PageData pageData) {
		this.pageData = pageData;	
		if (pageData != null) {
			putBodyParameter("PageData" , new Gson().toJson(pageData));
		}	
	}

	public static class PackageDTO {

		@SerializedName("PackageCode")
		private String packageCode;

		@SerializedName("PackageVersion")
		private String packageVersion;

		public String getPackageCode() {
			return this.packageCode;
		}

		public void setPackageCode(String packageCode) {
			this.packageCode = packageCode;
		}

		public String getPackageVersion() {
			return this.packageVersion;
		}

		public void setPackageVersion(String packageVersion) {
			this.packageVersion = packageVersion;
		}
	}

	public static class PageData {

		@SerializedName("NextToken")
		private String nextToken;

		@SerializedName("MaxResults")
		private Integer maxResults;

		public String getNextToken() {
			return this.nextToken;
		}

		public void setNextToken(String nextToken) {
			this.nextToken = nextToken;
		}

		public Integer getMaxResults() {
			return this.maxResults;
		}

		public void setMaxResults(Integer maxResults) {
			this.maxResults = maxResults;
		}
	}

	@Override
	public Class<ListSubscriptionByPackageResponse> getResponseClass() {
		return ListSubscriptionByPackageResponse.class;
	}

}
