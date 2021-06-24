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
		opsQueryDiskModelResponse.setDetachedTime(_ctx.stringValue("OpsQueryDiskModelResponse.DetachedTime"));
		opsQueryDiskModelResponse.setDescription(_ctx.stringValue("OpsQueryDiskModelResponse.Description"));
		opsQueryDiskModelResponse.setCreatedTime(_ctx.stringValue("OpsQueryDiskModelResponse.CreatedTime"));
		opsQueryDiskModelResponse.setCategory(_ctx.stringValue("OpsQueryDiskModelResponse.Category"));
		opsQueryDiskModelResponse.setSize(_ctx.integerValue("OpsQueryDiskModelResponse.Size"));
		opsQueryDiskModelResponse.setSnapshotLinkId(_ctx.stringValue("OpsQueryDiskModelResponse.SnapshotLinkId"));
		opsQueryDiskModelResponse.setDeleteAutoSnapshot(_ctx.booleanValue("OpsQueryDiskModelResponse.DeleteAutoSnapshot"));
		opsQueryDiskModelResponse.setBusinessStatus(_ctx.stringValue("OpsQueryDiskModelResponse.BusinessStatus"));
		opsQueryDiskModelResponse.setIopsSize(_ctx.integerValue("OpsQueryDiskModelResponse.IopsSize"));
		opsQueryDiskModelResponse.setModifiedTime(_ctx.stringValue("OpsQueryDiskModelResponse.ModifiedTime"));
		opsQueryDiskModelResponse.setImageId(_ctx.stringValue("OpsQueryDiskModelResponse.ImageId"));
		opsQueryDiskModelResponse.setAliyunInstanceType(_ctx.stringValue("OpsQueryDiskModelResponse.AliyunInstanceType"));
		opsQueryDiskModelResponse.setBid(_ctx.stringValue("OpsQueryDiskModelResponse.Bid"));
		opsQueryDiskModelResponse.setStatus(_ctx.stringValue("OpsQueryDiskModelResponse.Status"));
		opsQueryDiskModelResponse.setAttachedTime(_ctx.stringValue("OpsQueryDiskModelResponse.AttachedTime"));
		opsQueryDiskModelResponse.setHouyiDiskId(_ctx.stringValue("OpsQueryDiskModelResponse.HouyiDiskId"));
		opsQueryDiskModelResponse.setZoneId(_ctx.stringValue("OpsQueryDiskModelResponse.ZoneId"));
		opsQueryDiskModelResponse.setClusterId(_ctx.stringValue("OpsQueryDiskModelResponse.ClusterId"));
		opsQueryDiskModelResponse.setInstanceId(_ctx.stringValue("OpsQueryDiskModelResponse.InstanceId"));
		opsQueryDiskModelResponse.setProductCode(_ctx.stringValue("OpsQueryDiskModelResponse.ProductCode"));
		opsQueryDiskModelResponse.setDevice(_ctx.stringValue("OpsQueryDiskModelResponse.Device"));
		opsQueryDiskModelResponse.setDeleteWithInstance(_ctx.booleanValue("OpsQueryDiskModelResponse.DeleteWithInstance"));
		opsQueryDiskModelResponse.setEnableAutoSnapshot(_ctx.booleanValue("OpsQueryDiskModelResponse.EnableAutoSnapshot"));
		opsQueryDiskModelResponse.setAutoSnapshotPolicyId(_ctx.stringValue("OpsQueryDiskModelResponse.AutoSnapshotPolicyId"));
		opsQueryDiskModelResponse.setDiskName(_ctx.stringValue("OpsQueryDiskModelResponse.DiskName"));
		opsQueryDiskModelResponse.setResourceOwnerId(_ctx.longValue("OpsQueryDiskModelResponse.ResourceOwnerId"));
		opsQueryDiskModelResponse.setPortable(_ctx.booleanValue("OpsQueryDiskModelResponse.Portable"));
		opsQueryDiskModelResponse.setSnapshotId(_ctx.stringValue("OpsQueryDiskModelResponse.SnapshotId"));
		opsQueryDiskModelResponse.setType(_ctx.stringValue("OpsQueryDiskModelResponse.Type"));
		opsQueryDiskModelResponse.setActive(_ctx.booleanValue("OpsQueryDiskModelResponse.Active"));
		opsQueryDiskModelResponse.setNumericId(_ctx.longValue("OpsQueryDiskModelResponse.NumericId"));
		opsQueryDiskModelResponse.setBootable(_ctx.booleanValue("OpsQueryDiskModelResponse.Bootable"));
		opsQueryDiskModelResponse.setRegionId(_ctx.stringValue("OpsQueryDiskModelResponse.RegionId"));
		opsQueryDiskModelResponse.setSeq(_ctx.stringValue("OpsQueryDiskModelResponse.Seq"));
		opsQueryDiskModelResponse.setDiskId(_ctx.stringValue("OpsQueryDiskModelResponse.DiskId"));

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryDiskModelResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setTagValue(_ctx.stringValue("OpsQueryDiskModelResponse.Tags["+ i +"].TagValue"));
			tag.setTagKey(_ctx.stringValue("OpsQueryDiskModelResponse.Tags["+ i +"].TagKey"));

			tags.add(tag);
		}
		opsQueryDiskModelResponse.setTags(tags);
	 
	 	return opsQueryDiskModelResponse;
	}
}