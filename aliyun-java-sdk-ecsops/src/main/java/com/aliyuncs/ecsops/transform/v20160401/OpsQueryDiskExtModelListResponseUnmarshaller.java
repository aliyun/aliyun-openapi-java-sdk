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
		opsQueryDiskExtModelListResponse.setPageSize(_ctx.integerValue("OpsQueryDiskExtModelListResponse.PageSize"));
		opsQueryDiskExtModelListResponse.setPageNumber(_ctx.integerValue("OpsQueryDiskExtModelListResponse.PageNumber"));

		List<DiskExtModel> diskExtModels = new ArrayList<DiskExtModel>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryDiskExtModelListResponse.DiskExtModels.Length"); i++) {
			DiskExtModel diskExtModel = new DiskExtModel();
			diskExtModel.setType(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].Type"));
			diskExtModel.setStatus(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].Status"));
			diskExtModel.setActive(_ctx.booleanValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].Active"));
			diskExtModel.setHouyiDiskId(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].HouyiDiskId"));
			diskExtModel.setEnableAutoSnapshot(_ctx.booleanValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].EnableAutoSnapshot"));
			diskExtModel.setBootable(_ctx.booleanValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].Bootable"));
			diskExtModel.setDiskId(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].DiskId"));
			diskExtModel.setSnapshotLinkId(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].SnapshotLinkId"));
			diskExtModel.setBid(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].Bid"));
			diskExtModel.setDeleteAutoSnapshot(_ctx.booleanValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].DeleteAutoSnapshot"));
			diskExtModel.setSeq(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].Seq"));
			diskExtModel.setIopsR(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].IopsR"));
			diskExtModel.setCacheStatus(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].CacheStatus"));
			diskExtModel.setDescription(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].Description"));
			diskExtModel.setDevice(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].Device"));
			diskExtModel.setDiskName(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].DiskName"));
			diskExtModel.setPortable(_ctx.booleanValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].Portable"));
			diskExtModel.setCreatedTime(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].CreatedTime"));
			diskExtModel.setImageId(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].ImageId"));
			diskExtModel.setAliyunInstanceType(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].AliyunInstanceType"));
			diskExtModel.setDeleteWithInstance(_ctx.booleanValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].DeleteWithInstance"));
			diskExtModel.setClusterId(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].ClusterId"));
			diskExtModel.setBpsR(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].BpsR"));
			diskExtModel.setBpsW(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].BpsW"));
			diskExtModel.setDetachedTime(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].DetachedTime"));
			diskExtModel.setAutoSnapshotPolicyId(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].AutoSnapshotPolicyId"));
			diskExtModel.setIopsSize(_ctx.integerValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].IopsSize"));
			diskExtModel.setInstanceId(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].InstanceId"));
			diskExtModel.setRegionId(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].RegionId"));
			diskExtModel.setCacheSize(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].CacheSize"));
			diskExtModel.setResourceOwnerId(_ctx.longValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].ResourceOwnerId"));
			diskExtModel.setIopsW(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].IopsW"));
			diskExtModel.setModifiedTime(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].ModifiedTime"));
			diskExtModel.setSnapshotId(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].SnapshotId"));
			diskExtModel.setSize(_ctx.integerValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].Size"));
			diskExtModel.setZoneId(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].ZoneId"));
			diskExtModel.setBusinessStatus(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].BusinessStatus"));
			diskExtModel.setAttachedTime(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].AttachedTime"));
			diskExtModel.setCategory(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].Category"));
			diskExtModel.setTdcQos(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].TdcQos"));
			diskExtModel.setNumericId(_ctx.longValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].NumericId"));
			diskExtModel.setProductCode(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].ProductCode"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagValue(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].Tags["+ j +"].TagValue"));
				tag.setTagKey(_ctx.stringValue("OpsQueryDiskExtModelListResponse.DiskExtModels["+ i +"].Tags["+ j +"].TagKey"));

				tags.add(tag);
			}
			diskExtModel.setTags(tags);

			diskExtModels.add(diskExtModel);
		}
		opsQueryDiskExtModelListResponse.setDiskExtModels(diskExtModels);
	 
	 	return opsQueryDiskExtModelListResponse;
	}
}