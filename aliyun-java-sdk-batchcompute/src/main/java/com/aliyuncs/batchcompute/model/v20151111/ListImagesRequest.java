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
package com.aliyuncs.batchcompute.model.v20151111;

import com.aliyuncs.batchcompute.main.v20151111.BatchComputeRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListImagesRequest extends BatchComputeRequest<ListImagesResponse> {

	public static final String SYSTEM = "System";
	public static final String SELF = "Self";

	public ListImagesRequest() {
		super("BatchCompute", "2015-11-11", "ListImages");
		setUriPattern("/images");
		setMethod(MethodType.GET);
	}


	private String marker;
	private int maxItemCount= 50;
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
		if(type!=null && !type.equals("")) {
			this.putQueryParameter("Type", type);
		}
	}

	public String getMarker() {
		return marker;
	}

	public void setMarker(String marker) {
		this.marker = marker;
		if(marker!=null && !marker.equals("")) {
			this.putQueryParameter("Marker", marker);
		}
	}

	public int getMaxItemCount() {
		return maxItemCount;
	}

	public void setMaxItemCount(int maxItemCount) {
		this.maxItemCount = maxItemCount;
		this.putQueryParameter("MaxItemCount",maxItemCount);
	}

	@Override
	public Class<ListImagesResponse> getResponseClass() {
		return ListImagesResponse.class;
	}

}
