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

package com.aliyuncs.mpserverless.model.v20190615;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeFileUploadSignedUrlRequest extends RpcAcsRequest<DescribeFileUploadSignedUrlResponse> {
	   

	private String contentType;

	private String spaceId;

	private String filename;

	private Float size;

	private String targetPath;
	public DescribeFileUploadSignedUrlRequest() {
		super("MPServerless", "2019-06-15", "DescribeFileUploadSignedUrl", "MPServerless");
		setMethod(MethodType.POST);
	}

	public String getContentType() {
		return this.contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
		if(contentType != null){
			putBodyParameter("ContentType", contentType);
		}
	}

	public String getSpaceId() {
		return this.spaceId;
	}

	public void setSpaceId(String spaceId) {
		this.spaceId = spaceId;
		if(spaceId != null){
			putBodyParameter("SpaceId", spaceId);
		}
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
		if(filename != null){
			putBodyParameter("Filename", filename);
		}
	}

	public Float getSize() {
		return this.size;
	}

	public void setSize(Float size) {
		this.size = size;
		if(size != null){
			putBodyParameter("Size", size.toString());
		}
	}

	public String getTargetPath() {
		return this.targetPath;
	}

	public void setTargetPath(String targetPath) {
		this.targetPath = targetPath;
		if(targetPath != null){
			putBodyParameter("TargetPath", targetPath);
		}
	}

	@Override
	public Class<DescribeFileUploadSignedUrlResponse> getResponseClass() {
		return DescribeFileUploadSignedUrlResponse.class;
	}

}
