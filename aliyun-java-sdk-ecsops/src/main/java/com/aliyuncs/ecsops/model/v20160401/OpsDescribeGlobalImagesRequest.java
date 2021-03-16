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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeGlobalImagesRequest extends RpcAcsRequest<OpsDescribeGlobalImagesResponse> {
	   

	private List<String> imageIds;

	private String imageRegionId;

	private Long osTypeId;

	private String imageCategory;

	private Integer pageNumber;

	private Integer pageSize;

	private Long imageOwner;

	private String status;

	private String auditParamStr;
	public OpsDescribeGlobalImagesRequest() {
		super("Ecsops", "2016-04-01", "OpsDescribeGlobalImages", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getImageIds() {
		return this.imageIds;
	}

	public void setImageIds(List<String> imageIds) {
		this.imageIds = imageIds;	
		if (imageIds != null) {
			for (int i = 0; i < imageIds.size(); i++) {
				putQueryParameter("ImageId." + (i + 1) , imageIds.get(i));
			}
		}	
	}

	public String getImageRegionId() {
		return this.imageRegionId;
	}

	public void setImageRegionId(String imageRegionId) {
		this.imageRegionId = imageRegionId;
		if(imageRegionId != null){
			putQueryParameter("ImageRegionId", imageRegionId);
		}
	}

	public Long getOsTypeId() {
		return this.osTypeId;
	}

	public void setOsTypeId(Long osTypeId) {
		this.osTypeId = osTypeId;
		if(osTypeId != null){
			putQueryParameter("OsTypeId", osTypeId.toString());
		}
	}

	public String getImageCategory() {
		return this.imageCategory;
	}

	public void setImageCategory(String imageCategory) {
		this.imageCategory = imageCategory;
		if(imageCategory != null){
			putQueryParameter("ImageCategory", imageCategory);
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public Long getImageOwner() {
		return this.imageOwner;
	}

	public void setImageOwner(Long imageOwner) {
		this.imageOwner = imageOwner;
		if(imageOwner != null){
			putQueryParameter("ImageOwner", imageOwner.toString());
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsDescribeGlobalImagesResponse> getResponseClass() {
		return OpsDescribeGlobalImagesResponse.class;
	}

}
