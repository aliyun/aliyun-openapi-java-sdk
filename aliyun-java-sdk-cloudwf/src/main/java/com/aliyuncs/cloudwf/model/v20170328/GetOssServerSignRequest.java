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

package com.aliyuncs.cloudwf.model.v20170328;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetOssServerSignRequest extends RpcAcsRequest<GetOssServerSignResponse> {
	
	public GetOssServerSignRequest() {
		super("cloudwf", "2017-03-28", "GetOssServerSign", "cloudwf");
	}

	private Integer dirType;

	public Integer getDirType() {
		return this.dirType;
	}

	public void setDirType(Integer dirType) {
		this.dirType = dirType;
		if(dirType != null){
			putQueryParameter("DirType", dirType.toString());
		}
	}

	@Override
	public Class<GetOssServerSignResponse> getResponseClass() {
		return GetOssServerSignResponse.class;
	}

}
