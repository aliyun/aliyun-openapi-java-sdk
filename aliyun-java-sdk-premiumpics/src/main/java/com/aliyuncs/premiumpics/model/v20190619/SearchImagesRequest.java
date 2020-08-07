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

package com.aliyuncs.premiumpics.model.v20190619;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SearchImagesRequest extends RpcAcsRequest<SearchImagesResponse> {
	   

	private String barrel;

	private Integer pageNumber;

	private List<SearchImageExtra> searchImageExtras;

	private Integer startIndex;

	private Integer pageSize;

	private String keyword;
	public SearchImagesRequest() {
		super("Premiumpics", "2019-06-19", "SearchImages");
		setMethod(MethodType.POST);
	}

	public String getBarrel() {
		return this.barrel;
	}

	public void setBarrel(String barrel) {
		this.barrel = barrel;
		if(barrel != null){
			putQueryParameter("Barrel", barrel);
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

	public List<SearchImageExtra> getSearchImageExtras() {
		return this.searchImageExtras;
	}

	public void setSearchImageExtras(List<SearchImageExtra> searchImageExtras) {
		this.searchImageExtras = searchImageExtras;	
		if (searchImageExtras != null) {
			for (int depth1 = 0; depth1 < searchImageExtras.size(); depth1++) {
				putQueryParameter("SearchImageExtra." + (depth1 + 1) + ".Name" , searchImageExtras.get(depth1).getName());
				putQueryParameter("SearchImageExtra." + (depth1 + 1) + ".Value" , searchImageExtras.get(depth1).getValue());
			}
		}	
	}

	public Integer getStartIndex() {
		return this.startIndex;
	}

	public void setStartIndex(Integer startIndex) {
		this.startIndex = startIndex;
		if(startIndex != null){
			putQueryParameter("StartIndex", startIndex.toString());
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

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
		if(keyword != null){
			putQueryParameter("Keyword", keyword);
		}
	}

	public static class SearchImageExtra {

		private String name;

		private String value;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public Class<SearchImagesResponse> getResponseClass() {
		return SearchImagesResponse.class;
	}

}
