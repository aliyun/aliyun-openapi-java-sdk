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

package com.aliyuncs.qianzhou.model.v20211111;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListClusterImagesRequest extends RoaAcsRequest<ListClusterImagesResponse> {
	   

	private String image_name;

	private String cluster_id;

	private String image_hash;

	private Integer page_no;

	private Integer page_size;
	public ListClusterImagesRequest() {
		super("qianzhou", "2021-11-11", "ListClusterImages");
		setUriPattern("/popapi/listClusterPodImages");
		setMethod(MethodType.POST);
	}

	public String getImage_name() {
		return this.image_name;
	}

	public void setImage_name(String image_name) {
		this.image_name = image_name;
		if(image_name != null){
			putQueryParameter("image_name", image_name);
		}
	}

	public String getCluster_id() {
		return this.cluster_id;
	}

	public void setCluster_id(String cluster_id) {
		this.cluster_id = cluster_id;
		if(cluster_id != null){
			putQueryParameter("cluster_id", cluster_id);
		}
	}

	public String getImage_hash() {
		return this.image_hash;
	}

	public void setImage_hash(String image_hash) {
		this.image_hash = image_hash;
		if(image_hash != null){
			putQueryParameter("image_hash", image_hash);
		}
	}

	public Integer getPage_no() {
		return this.page_no;
	}

	public void setPage_no(Integer page_no) {
		this.page_no = page_no;
		if(page_no != null){
			putQueryParameter("page_no", page_no.toString());
		}
	}

	public Integer getPage_size() {
		return this.page_size;
	}

	public void setPage_size(Integer page_size) {
		this.page_size = page_size;
		if(page_size != null){
			putQueryParameter("page_size", page_size.toString());
		}
	}

	@Override
	public Class<ListClusterImagesResponse> getResponseClass() {
		return ListClusterImagesResponse.class;
	}

}
