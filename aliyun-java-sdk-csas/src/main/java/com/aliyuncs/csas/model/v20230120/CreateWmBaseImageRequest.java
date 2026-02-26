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

package com.aliyuncs.csas.model.v20230120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateWmBaseImageRequest extends RpcAcsRequest<CreateWmBaseImageResponse> {
	   

	private Integer scale;

	private String wmInfoUint;

	private Long wmInfoSize;

	private String wmInfoBytesB64;

	private String wmType;

	private Integer width;

	private Integer opacity;

	private Integer height;
	public CreateWmBaseImageRequest() {
		super("csas", "2023-01-20", "CreateWmBaseImage");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Integer getScale() {
		return this.scale;
	}

	public void setScale(Integer scale) {
		this.scale = scale;
		if(scale != null){
			putBodyParameter("Scale", scale.toString());
		}
	}

	public String getWmInfoUint() {
		return this.wmInfoUint;
	}

	public void setWmInfoUint(String wmInfoUint) {
		this.wmInfoUint = wmInfoUint;
		if(wmInfoUint != null){
			putBodyParameter("WmInfoUint", wmInfoUint);
		}
	}

	public Long getWmInfoSize() {
		return this.wmInfoSize;
	}

	public void setWmInfoSize(Long wmInfoSize) {
		this.wmInfoSize = wmInfoSize;
		if(wmInfoSize != null){
			putBodyParameter("WmInfoSize", wmInfoSize.toString());
		}
	}

	public String getWmInfoBytesB64() {
		return this.wmInfoBytesB64;
	}

	public void setWmInfoBytesB64(String wmInfoBytesB64) {
		this.wmInfoBytesB64 = wmInfoBytesB64;
		if(wmInfoBytesB64 != null){
			putBodyParameter("WmInfoBytesB64", wmInfoBytesB64);
		}
	}

	public String getWmType() {
		return this.wmType;
	}

	public void setWmType(String wmType) {
		this.wmType = wmType;
		if(wmType != null){
			putBodyParameter("WmType", wmType);
		}
	}

	public Integer getWidth() {
		return this.width;
	}

	public void setWidth(Integer width) {
		this.width = width;
		if(width != null){
			putBodyParameter("Width", width.toString());
		}
	}

	public Integer getOpacity() {
		return this.opacity;
	}

	public void setOpacity(Integer opacity) {
		this.opacity = opacity;
		if(opacity != null){
			putBodyParameter("Opacity", opacity.toString());
		}
	}

	public Integer getHeight() {
		return this.height;
	}

	public void setHeight(Integer height) {
		this.height = height;
		if(height != null){
			putBodyParameter("Height", height.toString());
		}
	}

	@Override
	public Class<CreateWmBaseImageResponse> getResponseClass() {
		return CreateWmBaseImageResponse.class;
	}

}
