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

package com.aliyuncs.linkvisual.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryDevicePictureFileRequest extends RpcAcsRequest<QueryDevicePictureFileResponse> {
	   

	private String iotId;

	private String captureId;

	private Integer pictureType;
	public QueryDevicePictureFileRequest() {
		super("Linkvisual", "2018-01-20", "QueryDevicePictureFile", "linkvisual");
		setMethod(MethodType.POST);
	}

	public String getIotId() {
		return this.iotId;
	}

	public void setIotId(String iotId) {
		this.iotId = iotId;
		if(iotId != null){
			putQueryParameter("IotId", iotId);
		}
	}

	public String getCaptureId() {
		return this.captureId;
	}

	public void setCaptureId(String captureId) {
		this.captureId = captureId;
		if(captureId != null){
			putQueryParameter("CaptureId", captureId);
		}
	}

	public Integer getPictureType() {
		return this.pictureType;
	}

	public void setPictureType(Integer pictureType) {
		this.pictureType = pictureType;
		if(pictureType != null){
			putQueryParameter("PictureType", pictureType.toString());
		}
	}

	@Override
	public Class<QueryDevicePictureFileResponse> getResponseClass() {
		return QueryDevicePictureFileResponse.class;
	}

}
