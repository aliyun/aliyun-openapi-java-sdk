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

import com.aliyuncs.ecsops.model.v20160401.OpsQueryDiskModelResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryDiskModelResponse.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryDiskModelResponseUnmarshaller {

	public static OpsQueryDiskModelResponse unmarshall(OpsQueryDiskModelResponse opsQueryDiskModelResponse, UnmarshallerContext _ctx) {
		
		opsQueryDiskModelResponse.setRequestId(_ctx.stringValue("OpsQueryDiskModelResponse.RequestId"));
		opsQueryDiskModelResponse.setBid(_ctx.stringValue("OpsQueryDiskModelResponse.Bid"));
		opsQueryDiskModelResponse.setResourceOwnerId(_ctx.longValue("OpsQueryDiskModelResponse.ResourceOwnerId"));
		opsQueryDiskModelResponse.setAliyunInstanceType(_ctx.stringValue("OpsQueryDiskModelResponse.AliyunInstanceType"));
		opsQueryDiskModelResponse.setDiskId(_ctx.stringValue("OpsQueryDiskModelResponse.DiskId"));
		opsQueryDiskModelResponse.setStatus(_ctx.stringValue("OpsQueryDiskModelResponse.Status"));
		opsQueryDiskModelResponse.setCreatedTime(_ctx.stringValue("OpsQueryDiskModelResponse.CreatedTime"));
		opsQueryDiskModelResponse.setModifiedTime(_ctx.stringValue("OpsQueryDiskModelResponse.ModifiedTime"));
		opsQueryDiskModelResponse.setSeq(_ctx.stringValue("OpsQueryDiskModelResponse.Seq"));
		opsQueryDiskModelResponse.setType(_ctx.stringValue("OpsQueryDiskModelResponse.Type"));
		opsQueryDiskModelResponse.setCategory(_ctx.stringValue("OpsQueryDiskModelResponse.Category"));
		opsQueryDiskModelResponse.setRegionId(_ctx.stringValue("OpsQueryDiskModelResponse.RegionId"));
		opsQueryDiskModelResponse.setZoneId(_ctx.stringValue("OpsQueryDiskModelResponse.ZoneId"));
		opsQueryDiskModelResponse.setClusterId(_ctx.stringValue("OpsQueryDiskModelResponse.ClusterId"));
		opsQueryDiskModelResponse.setDiskName(_ctx.stringValue("OpsQueryDiskModelResponse.DiskName"));
		opsQueryDiskModelResponse.setDescription(_ctx.stringValue("OpsQueryDiskModelResponse.Description"));
		opsQueryDiskModelResponse.setSize(_ctx.integerValue("OpsQueryDiskModelResponse.Size"));
		opsQueryDiskModelResponse.setActive(_ctx.booleanValue("OpsQueryDiskModelResponse.Active"));
		opsQueryDiskModelResponse.setBootable(_ctx.booleanValue("OpsQueryDiskModelResponse.Bootable"));
		opsQueryDiskModelResponse.setPortable(_ctx.booleanValue("OpsQueryDiskModelResponse.Portable"));
		opsQueryDiskModelResponse.setImageId(_ctx.stringValue("OpsQueryDiskModelResponse.ImageId"));
		opsQueryDiskModelResponse.setSnapshotId(_ctx.stringValue("OpsQueryDiskModelResponse.SnapshotId"));
		opsQueryDiskModelResponse.setAutoSnapshotPolicyId(_ctx.stringValue("OpsQueryDiskModelResponse.AutoSnapshotPolicyId"));
		opsQueryDiskModelResponse.setSnapshotLinkId(_ctx.stringValue("OpsQueryDiskModelResponse.SnapshotLinkId"));
		opsQueryDiskModelResponse.setInstanceId(_ctx.stringValue("OpsQueryDiskModelResponse.InstanceId"));
		opsQueryDiskModelResponse.setDevice(_ctx.stringValue("OpsQueryDiskModelResponse.Device"));
		opsQueryDiskModelResponse.setDeleteWithInstance(_ctx.booleanValue("OpsQueryDiskModelResponse.DeleteWithInstance"));
		opsQueryDiskModelResponse.setDeleteAutoSnapshot(_ctx.booleanValue("OpsQueryDiskModelResponse.DeleteAutoSnapshot"));
		opsQueryDiskModelResponse.setEnableAutoSnapshot(_ctx.booleanValue("OpsQueryDiskModelResponse.EnableAutoSnapshot"));
		opsQueryDiskModelResponse.setAttachedTime(_ctx.stringValue("OpsQueryDiskModelResponse.AttachedTime"));
		opsQueryDiskModelResponse.setDetachedTime(_ctx.stringValue("OpsQueryDiskModelResponse.DetachedTime"));
		opsQueryDiskModelResponse.setProductCode(_ctx.stringValue("OpsQueryDiskModelResponse.ProductCode"));
		opsQueryDiskModelResponse.setHouyiDiskId(_ctx.stringValue("OpsQueryDiskModelResponse.HouyiDiskId"));
		opsQueryDiskModelResponse.setNumericId(_ctx.longValue("OpsQueryDiskModelResponse.NumericId"));
		opsQueryDiskModelResponse.setBusinessStatus(_ctx.stringValue("OpsQueryDiskModelResponse.BusinessStatus"));
		opsQueryDiskModelResponse.setIopsSize(_ctx.integerValue("OpsQueryDiskModelResponse.IopsSize"));

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryDiskModelResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setTagKey(_ctx.stringValue("OpsQueryDiskModelResponse.Tags["+ i +"].TagKey"));
			tag.setTagValue(_ctx.stringValue("OpsQueryDiskModelResponse.Tags["+ i +"].TagValue"));

			tags.add(tag);
		}
		opsQueryDiskModelResponse.setTags(tags);
	 
	 	return opsQueryDiskModelResponse;
	}
}