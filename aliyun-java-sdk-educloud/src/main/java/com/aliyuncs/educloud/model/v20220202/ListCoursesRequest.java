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

package com.aliyuncs.educloud.model.v20220202;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListCoursesRequest extends RpcAcsRequest<ListCoursesResponse> {
	   

	private Long pageSize;

	private Long page;

	private List<String> id;
	public ListCoursesRequest() {
		super("EduCloud", "2022-02-02", "ListCourses");
		setMethod(MethodType.GET);
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public Long getPage() {
		return this.page;
	}

	public void setPage(Long page) {
		this.page = page;
		if(page != null){
			putQueryParameter("Page", page.toString());
		}
	}

	public List<String> getId() {
		return this.id;
	}

	public void setId(List<String> id) {
		this.id = id;	
		if (id != null) {
			for (int depth1 = 0; depth1 < id.size(); depth1++) {
				putQueryParameter("Id." + (depth1 + 1) , id.get(depth1));
			}
		}	
	}

	@Override
	public Class<ListCoursesResponse> getResponseClass() {
		return ListCoursesResponse.class;
	}

}
