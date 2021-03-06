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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.GetOwnerApplyOrderDetailResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetOwnerApplyOrderDetailResponse.OwnerApplyOrderDetail;
import com.aliyuncs.dms_enterprise.model.v20181101.GetOwnerApplyOrderDetailResponse.OwnerApplyOrderDetail.Resource;
import com.aliyuncs.dms_enterprise.model.v20181101.GetOwnerApplyOrderDetailResponse.OwnerApplyOrderDetail.Resource.ResourceDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOwnerApplyOrderDetailResponseUnmarshaller {

	public static GetOwnerApplyOrderDetailResponse unmarshall(GetOwnerApplyOrderDetailResponse getOwnerApplyOrderDetailResponse, UnmarshallerContext _ctx) {
		
		getOwnerApplyOrderDetailResponse.setRequestId(_ctx.stringValue("GetOwnerApplyOrderDetailResponse.RequestId"));
		getOwnerApplyOrderDetailResponse.setErrorCode(_ctx.stringValue("GetOwnerApplyOrderDetailResponse.ErrorCode"));
		getOwnerApplyOrderDetailResponse.setErrorMessage(_ctx.stringValue("GetOwnerApplyOrderDetailResponse.ErrorMessage"));
		getOwnerApplyOrderDetailResponse.setSuccess(_ctx.booleanValue("GetOwnerApplyOrderDetailResponse.Success"));

		OwnerApplyOrderDetail ownerApplyOrderDetail = new OwnerApplyOrderDetail();
		ownerApplyOrderDetail.setApplyType(_ctx.stringValue("GetOwnerApplyOrderDetailResponse.OwnerApplyOrderDetail.ApplyType"));

		List<Resource> resources = new ArrayList<Resource>();
		for (int i = 0; i < _ctx.lengthValue("GetOwnerApplyOrderDetailResponse.OwnerApplyOrderDetail.Resources.Length"); i++) {
			Resource resource = new Resource();
			resource.setLogic(_ctx.booleanValue("GetOwnerApplyOrderDetailResponse.OwnerApplyOrderDetail.Resources["+ i +"].Logic"));
			resource.setTargetId(_ctx.stringValue("GetOwnerApplyOrderDetailResponse.OwnerApplyOrderDetail.Resources["+ i +"].TargetId"));

			ResourceDetail resourceDetail = new ResourceDetail();
			resourceDetail.setTableName(_ctx.stringValue("GetOwnerApplyOrderDetailResponse.OwnerApplyOrderDetail.Resources["+ i +"].ResourceDetail.TableName"));
			resourceDetail.setSearchName(_ctx.stringValue("GetOwnerApplyOrderDetailResponse.OwnerApplyOrderDetail.Resources["+ i +"].ResourceDetail.SearchName"));
			resourceDetail.setEnvType(_ctx.stringValue("GetOwnerApplyOrderDetailResponse.OwnerApplyOrderDetail.Resources["+ i +"].ResourceDetail.EnvType"));
			resourceDetail.setDbType(_ctx.stringValue("GetOwnerApplyOrderDetailResponse.OwnerApplyOrderDetail.Resources["+ i +"].ResourceDetail.DbType"));

			List<String> ownerNickNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetOwnerApplyOrderDetailResponse.OwnerApplyOrderDetail.Resources["+ i +"].ResourceDetail.OwnerNickNames.Length"); j++) {
				ownerNickNames.add(_ctx.stringValue("GetOwnerApplyOrderDetailResponse.OwnerApplyOrderDetail.Resources["+ i +"].ResourceDetail.OwnerNickNames["+ j +"]"));
			}
			resourceDetail.setOwnerNickNames(ownerNickNames);

			List<Long> ownerIds = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("GetOwnerApplyOrderDetailResponse.OwnerApplyOrderDetail.Resources["+ i +"].ResourceDetail.OwnerIds.Length"); j++) {
				ownerIds.add(_ctx.longValue("GetOwnerApplyOrderDetailResponse.OwnerApplyOrderDetail.Resources["+ i +"].ResourceDetail.OwnerIds["+ j +"]"));
			}
			resourceDetail.setOwnerIds(ownerIds);
			resource.setResourceDetail(resourceDetail);

			resources.add(resource);
		}
		ownerApplyOrderDetail.setResources(resources);
		getOwnerApplyOrderDetailResponse.setOwnerApplyOrderDetail(ownerApplyOrderDetail);
	 
	 	return getOwnerApplyOrderDetailResponse;
	}
}