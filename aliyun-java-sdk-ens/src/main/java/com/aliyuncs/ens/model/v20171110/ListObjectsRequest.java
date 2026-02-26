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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListObjectsRequest extends RpcAcsRequest<ListObjectsResponse> {
	   

	private Long maxKeys;

	private String continuationToken;

	private String prefix;

	private String marker;

	private String bucketName;

	private String encodingType;

	private String startAfter;
	public ListObjectsRequest() {
		super("Ens", "2017-11-10", "ListObjects", "ens");
		setMethod(MethodType.POST);
	}

	public Long getMaxKeys() {
		return this.maxKeys;
	}

	public void setMaxKeys(Long maxKeys) {
		this.maxKeys = maxKeys;
		if(maxKeys != null){
			putQueryParameter("MaxKeys", maxKeys.toString());
		}
	}

	public String getContinuationToken() {
		return this.continuationToken;
	}

	public void setContinuationToken(String continuationToken) {
		this.continuationToken = continuationToken;
		if(continuationToken != null){
			putQueryParameter("ContinuationToken", continuationToken);
		}
	}

	public String getPrefix() {
		return this.prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
		if(prefix != null){
			putQueryParameter("Prefix", prefix);
		}
	}

	public String getMarker() {
		return this.marker;
	}

	public void setMarker(String marker) {
		this.marker = marker;
		if(marker != null){
			putQueryParameter("Marker", marker);
		}
	}

	public String getBucketName() {
		return this.bucketName;
	}

	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
		if(bucketName != null){
			putQueryParameter("BucketName", bucketName);
		}
	}

	public String getEncodingType() {
		return this.encodingType;
	}

	public void setEncodingType(String encodingType) {
		this.encodingType = encodingType;
		if(encodingType != null){
			putQueryParameter("EncodingType", encodingType);
		}
	}

	public String getStartAfter() {
		return this.startAfter;
	}

	public void setStartAfter(String startAfter) {
		this.startAfter = startAfter;
		if(startAfter != null){
			putQueryParameter("StartAfter", startAfter);
		}
	}

	@Override
	public Class<ListObjectsResponse> getResponseClass() {
		return ListObjectsResponse.class;
	}

}
