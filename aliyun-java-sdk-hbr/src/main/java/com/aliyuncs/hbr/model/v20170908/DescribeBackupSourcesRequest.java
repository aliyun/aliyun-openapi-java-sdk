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

package com.aliyuncs.hbr.model.v20170908;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeBackupSourcesRequest extends RpcAcsRequest<DescribeBackupSourcesResponse> {
	   

	private List<Filters> filterss;

	private Integer pageNumber;

	private Integer pageSize;

	private String sourceType;
	public DescribeBackupSourcesRequest() {
		super("hbr", "2017-09-08", "DescribeBackupSources", "hbr");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Filters> getFilterss() {
		return this.filterss;
	}

	public void setFilterss(List<Filters> filterss) {
		this.filterss = filterss;	
		if (filterss != null) {
			for (int depth1 = 0; depth1 < filterss.size(); depth1++) {
				if (filterss.get(depth1).getValuess() != null) {
					for (int i = 0; i < filterss.get(depth1).getValuess().size(); i++) {
						putQueryParameter("Filters." + (depth1 + 1) + ".Values." + (i + 1) , filterss.get(depth1).getValuess().get(i));
					}
				}
				putQueryParameter("Filters." + (depth1 + 1) + ".Key" , filterss.get(depth1).getKey());
			}
		}	
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getSourceType() {
		return this.sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
		if(sourceType != null){
			putQueryParameter("SourceType", sourceType);
		}
	}

	public static class Filters {

		private List<String> valuess;

		private String key;

		public List<String> getValuess() {
			return this.valuess;
		}

		public void setValuess(List<String> valuess) {
			this.valuess = valuess;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<DescribeBackupSourcesResponse> getResponseClass() {
		return DescribeBackupSourcesResponse.class;
	}

}
