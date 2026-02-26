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

package com.aliyuncs.copyright.model.v20190123;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateDownloadTaskRequest extends RpcAcsRequest<CreateDownloadTaskResponse> {
	   

	private Long dateEnd;

	private String downloadType;

	private String bizType;

	private Long dateStart;

	private String name;
	public CreateDownloadTaskRequest() {
		super("Copyright", "2019-01-23", "CreateDownloadTask", "swcopyright");
		setMethod(MethodType.POST);
	}

	public Long getDateEnd() {
		return this.dateEnd;
	}

	public void setDateEnd(Long dateEnd) {
		this.dateEnd = dateEnd;
		if(dateEnd != null){
			putQueryParameter("DateEnd", dateEnd.toString());
		}
	}

	public String getDownloadType() {
		return this.downloadType;
	}

	public void setDownloadType(String downloadType) {
		this.downloadType = downloadType;
		if(downloadType != null){
			putQueryParameter("DownloadType", downloadType);
		}
	}

	public String getBizType() {
		return this.bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
		if(bizType != null){
			putQueryParameter("BizType", bizType);
		}
	}

	public Long getDateStart() {
		return this.dateStart;
	}

	public void setDateStart(Long dateStart) {
		this.dateStart = dateStart;
		if(dateStart != null){
			putQueryParameter("DateStart", dateStart.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	@Override
	public Class<CreateDownloadTaskResponse> getResponseClass() {
		return CreateDownloadTaskResponse.class;
	}

}
