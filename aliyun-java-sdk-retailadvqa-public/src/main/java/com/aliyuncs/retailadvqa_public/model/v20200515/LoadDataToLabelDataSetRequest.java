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

package com.aliyuncs.retailadvqa_public.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class LoadDataToLabelDataSetRequest extends RpcAcsRequest<LoadDataToLabelDataSetResponse> {
	   

	private String accessId;

	private String separator;

	private String ossPath;

	private String cubeId;

	private List<String> colNameLists;
	public LoadDataToLabelDataSetRequest() {
		super("retailadvqa-public", "2020-05-15", "LoadDataToLabelDataSet");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getAccessId() {
		return this.accessId;
	}

	public void setAccessId(String accessId) {
		this.accessId = accessId;
		if(accessId != null){
			putQueryParameter("AccessId", accessId);
		}
	}

	public String getSeparator() {
		return this.separator;
	}

	public void setSeparator(String separator) {
		this.separator = separator;
		if(separator != null){
			putQueryParameter("Separator", separator);
		}
	}

	public String getOssPath() {
		return this.ossPath;
	}

	public void setOssPath(String ossPath) {
		this.ossPath = ossPath;
		if(ossPath != null){
			putQueryParameter("OssPath", ossPath);
		}
	}

	public String getCubeId() {
		return this.cubeId;
	}

	public void setCubeId(String cubeId) {
		this.cubeId = cubeId;
		if(cubeId != null){
			putQueryParameter("CubeId", cubeId);
		}
	}

	public List<String> getColNameLists() {
		return this.colNameLists;
	}

	public void setColNameLists(List<String> colNameLists) {
		this.colNameLists = colNameLists;	
		if (colNameLists != null) {
			for (int i = 0; i < colNameLists.size(); i++) {
				putQueryParameter("ColNameList." + (i + 1) , colNameLists.get(i));
			}
		}	
	}

	@Override
	public Class<LoadDataToLabelDataSetResponse> getResponseClass() {
		return LoadDataToLabelDataSetResponse.class;
	}

}
