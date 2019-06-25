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

package com.aliyuncs.market.model.v20151101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class SearchCommoditiesRequest extends RpcAcsRequest<SearchCommoditiesResponse> {
	
	public SearchCommoditiesRequest() {
		super("Market", "2015-11-01", "SearchCommodities");
	}

	private String keywords;

	private List<OrderBys> orderByss;

	private List<Properties> propertiess;

	public String getKeywords() {
		return this.keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
		if(keywords != null){
			putQueryParameter("Keywords", keywords);
		}
	}

	public List<OrderBys> getOrderByss() {
		return this.orderByss;
	}

	public void setOrderByss(List<OrderBys> orderByss) {
		this.orderByss = orderByss;	
		if (orderByss != null) {
			for (int depth1 = 0; depth1 < orderByss.size(); depth1++) {
				putQueryParameter("OrderBys." + (depth1 + 1) + ".Value" , orderByss.get(depth1).getValue());
			}
		}	
	}

	public List<Properties> getPropertiess() {
		return this.propertiess;
	}

	public void setPropertiess(List<Properties> propertiess) {
		this.propertiess = propertiess;	
		if (propertiess != null) {
			for (int depth1 = 0; depth1 < propertiess.size(); depth1++) {
				putQueryParameter("Properties." + (depth1 + 1) + ".Value" , propertiess.get(depth1).getValue());
				putQueryParameter("Properties." + (depth1 + 1) + ".Key" , propertiess.get(depth1).getKey());
			}
		}	
	}

	public static class OrderBys {

		private String value;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	public static class Properties {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<SearchCommoditiesResponse> getResponseClass() {
		return SearchCommoditiesResponse.class;
	}

}
