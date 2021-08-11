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

package com.aliyuncs.premiumpics.model.v20200505;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListDesignRequest extends RpcAcsRequest<ListDesignResponse> {
	   

	private String extInfo;

	private String designVersion;

	private String designType;

	private Integer pageSize;
	public ListDesignRequest() {
		super("Premiumpics", "2020-05-05", "ListDesign");
		setMethod(MethodType.POST);
	}

	public String getExtInfo() {
		return this.extInfo;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
		if(extInfo != null){
			putQueryParameter("ExtInfo", extInfo);
		}
	}

	public String getDesignVersion() {
		return this.designVersion;
	}

	public void setDesignVersion(String designVersion) {
		this.designVersion = designVersion;
		if(designVersion != null){
			putQueryParameter("DesignVersion", designVersion);
		}
	}

	public String getDesignType() {
		return this.designType;
	}

	public void setDesignType(String designType) {
		this.designType = designType;
		if(designType != null){
			putQueryParameter("DesignType", designType);
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

	@Override
	public Class<ListDesignResponse> getResponseClass() {
		return ListDesignResponse.class;
	}

}
