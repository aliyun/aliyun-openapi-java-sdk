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
public class SetUpgradeImgByModelRequest extends RpcAcsRequest<SetUpgradeImgByModelResponse> {
	
	public SetUpgradeImgByModelRequest() {
		super("cloudwf", "2017-03-28", "SetUpgradeImgByModel", "cloudwf");
	}

	private String imgAddr;

	private String imgVersion;

	private Long apModelId;

	private String comment;

	public String getImgAddr() {
		return this.imgAddr;
	}

	public void setImgAddr(String imgAddr) {
		this.imgAddr = imgAddr;
		if(imgAddr != null){
			putQueryParameter("ImgAddr", imgAddr);
		}
	}

	public String getImgVersion() {
		return this.imgVersion;
	}

	public void setImgVersion(String imgVersion) {
		this.imgVersion = imgVersion;
		if(imgVersion != null){
			putQueryParameter("ImgVersion", imgVersion);
		}
	}

	public Long getApModelId() {
		return this.apModelId;
	}

	public void setApModelId(Long apModelId) {
		this.apModelId = apModelId;
		if(apModelId != null){
			putQueryParameter("ApModelId", apModelId.toString());
		}
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
		if(comment != null){
			putQueryParameter("Comment", comment);
		}
	}

	@Override
	public Class<SetUpgradeImgByModelResponse> getResponseClass() {
		return SetUpgradeImgByModelResponse.class;
	}

}
