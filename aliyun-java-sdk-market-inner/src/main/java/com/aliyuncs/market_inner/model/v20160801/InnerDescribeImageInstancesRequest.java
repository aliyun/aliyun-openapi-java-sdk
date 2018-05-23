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

package com.aliyuncs.market_inner.model.v20160801;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class InnerDescribeImageInstancesRequest extends RpcAcsRequest<InnerDescribeImageInstancesResponse> {
	
	public InnerDescribeImageInstancesRequest() {
		super("Market-Inner", "2016-08-01", "InnerDescribeImageInstances", "yunmarket", "innerAPI");
	}

	private String ecsInstanceId;

	private Integer pageSize;

	private String imageNo;

	private String productName;

	private Integer pageNumber;

	private List<Long> imageInstanceIdLists;

	private String regionNo;

	public String getEcsInstanceId() {
		return this.ecsInstanceId;
	}

	public void setEcsInstanceId(String ecsInstanceId) {
		this.ecsInstanceId = ecsInstanceId;
		if(ecsInstanceId != null){
			putQueryParameter("EcsInstanceId", ecsInstanceId);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getImageNo() {
		return this.imageNo;
	}

	public void setImageNo(String imageNo) {
		this.imageNo = imageNo;
		if(imageNo != null){
			putQueryParameter("ImageNo", imageNo);
		}
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
		if(productName != null){
			putQueryParameter("ProductName", productName);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public List<Long> getImageInstanceIdLists() {
		return this.imageInstanceIdLists;
	}

	public void setImageInstanceIdLists(List<Long> imageInstanceIdLists) {
		this.imageInstanceIdLists = imageInstanceIdLists;	
		if (imageInstanceIdLists != null) {
			for (int i = 0; i < imageInstanceIdLists.size(); i++) {
				putQueryParameter("ImageInstanceIdList." + (i + 1) , imageInstanceIdLists.get(i));
			}
		}	
	}

	public String getRegionNo() {
		return this.regionNo;
	}

	public void setRegionNo(String regionNo) {
		this.regionNo = regionNo;
		if(regionNo != null){
			putQueryParameter("RegionNo", regionNo);
		}
	}

	@Override
	public Class<InnerDescribeImageInstancesResponse> getResponseClass() {
		return InnerDescribeImageInstancesResponse.class;
	}

}
