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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsQueryDiskExtModelListResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryDiskExtModelListResponse.DiskExtModel;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryDiskExtModelListResponse.DiskExtModel.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryDiskExtModelListResponseUnmarshaller {

	public static OpsQueryDiskExtModelListResponse unmarshall(OpsQueryDiskExtModelListResponse opsQueryDiskExtModelListResponse, UnmarshallerContext _ctx) {
		
		opsQueryDiskExtModelListResponse.setRequestId(_ctx.stringValue("OpsQueryDiskExtModelListResponse.RequestId"));
		opsQueryDiskExtModelListResponse.setTotalCount(_ctx.integerValue("OpsQueryDiskExtModelListResponse.TotalCount"));
		opsQueryDiskExtModelListResponse.setPageNumber(_ctx.integerValue("OpsQueryDiskExtModelListResponse.PageNumber"));
		opsQueryDiskExtModelListResponse.setPageSize(_ctx.integerValue("OpsQueryDiskExtModelListResponse.PageSize"));

		List<DiskExtModel> diskExtModels = new ArrayList<DiskExtModel>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryDiskExtModelListResponse.DiskExtModels.Length"); i++) {
			DiskExtModel diskExtModel = new DiskExtModel();
			diskExtModel.setBid(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].Bid"));
			diskExtModel.setResourceOwnerId(_ctx.longValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].ResourceOwnerId"));
			diskExtModel.setAliyunInstanceType(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].AliyunInstanceType"));
			diskExtModel.setDiskId(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].DiskId"));
			diskExtModel.setStatus(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].Status"));
			diskExtModel.setCreatedTime(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].CreatedTime"));
			diskExtModel.setModifiedTime(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].ModifiedTime"));
			diskExtModel.setSeq(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].Seq"));
			diskExtModel.setType(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].Type"));
			diskExtModel.setCategory(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].Category"));
			diskExtModel.setRegionId(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].RegionId"));
			diskExtModel.setZoneId(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].ZoneId"));
			diskExtModel.setClusterId(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].ClusterId"));
			diskExtModel.setDiskName(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].DiskName"));
			diskExtModel.setDescription(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].Description"));
			diskExtModel.setSize(_ctx.integerValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].Size"));
			diskExtModel.setActive(_ctx.booleanValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].Active"));
			diskExtModel.setBootable(_ctx.booleanValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].Bootable"));
			diskExtModel.setPortable(_ctx.booleanValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].Portable"));
			diskExtModel.setImageId(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].ImageId"));
			diskExtModel.setSnapshotId(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].SnapshotId"));
			diskExtModel.setAutoSnapshotPolicyId(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].AutoSnapshotPolicyId"));
			diskExtModel.setSnapshotLinkId(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].SnapshotLinkId"));
			diskExtModel.setInstanceId(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].InstanceId"));
			diskExtModel.setDevice(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].Device"));
			diskExtModel.setDeleteWithInstance(_ctx.booleanValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].DeleteWithInstance"));
			diskExtModel.setDeleteAutoSnapshot(_ctx.booleanValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].DeleteAutoSnapshot"));
			diskExtModel.setEnableAutoSnapshot(_ctx.booleanValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].EnableAutoSnapshot"));
			diskExtModel.setAttachedTime(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].AttachedTime"));
			diskExtModel.setDetachedTime(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].DetachedTime"));
			diskExtModel.setProductCode(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].ProductCode"));
			diskExtModel.setHouyiDiskId(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].HouyiDiskId"));
			diskExtModel.setNumericId(_ctx.longValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].NumericId"));
			diskExtModel.setBusinessStatus(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].BusinessStatus"));
			diskExtModel.setIopsSize(_ctx.integerValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].IopsSize"));
			diskExtModel.setCacheStatus(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].CacheStatus"));
			diskExtModel.setCacheSize(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].CacheSize"));
			diskExtModel.setIopsW(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].IopsW"));
			diskExtModel.setIopsR(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].IopsR"));
			diskExtModel.setBpsW(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].BpsW"));
			diskExtModel.setBpsR(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].BpsR"));
			diskExtModel.setTdcQos(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].TdcQos"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			diskExtModel.setTags(tags);

			diskExtModels.add(diskExtModel);
		}
		opsQueryDiskExtModelListResponse.setDiskExtModels(diskExtModels);
	 
	 	return opsQueryDiskExtModelListResponse;
	}
}