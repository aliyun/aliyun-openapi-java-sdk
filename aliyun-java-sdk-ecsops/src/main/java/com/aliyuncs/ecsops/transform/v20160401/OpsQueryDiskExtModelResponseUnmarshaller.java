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

import com.aliyuncs.ecsops.model.v20160401.OpsQueryDiskExtModelResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryDiskExtModelResponse.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryDiskExtModelResponseUnmarshaller {

	public static OpsQueryDiskExtModelResponse unmarshall(OpsQueryDiskExtModelResponse opsQueryDiskExtModelResponse, UnmarshallerContext _ctx) {
		
		opsQueryDiskExtModelResponse.setRequestId(_ctx.stringValue("OpsQueryDiskExtModelResponse.RequestId"));
		opsQueryDiskExtModelResponse.setBid(_ctx.stringValue("OpsQueryDiskExtModelResponse.Bid"));
		opsQueryDiskExtModelResponse.setResourceOwnerId(_ctx.longValue("OpsQueryDiskExtModelResponse.ResourceOwnerId"));
		opsQueryDiskExtModelResponse.setAliyunInstanceType(_ctx.stringValue("OpsQueryDiskExtModelResponse.AliyunInstanceType"));
		opsQueryDiskExtModelResponse.setDiskId(_ctx.stringValue("OpsQueryDiskExtModelResponse.DiskId"));
		opsQueryDiskExtModelResponse.setStatus(_ctx.stringValue("OpsQueryDiskExtModelResponse.Status"));
		opsQueryDiskExtModelResponse.setCreatedTime(_ctx.stringValue("OpsQueryDiskExtModelResponse.CreatedTime"));
		opsQueryDiskExtModelResponse.setModifiedTime(_ctx.stringValue("OpsQueryDiskExtModelResponse.ModifiedTime"));
		opsQueryDiskExtModelResponse.setSeq(_ctx.stringValue("OpsQueryDiskExtModelResponse.Seq"));
		opsQueryDiskExtModelResponse.setType(_ctx.stringValue("OpsQueryDiskExtModelResponse.Type"));
		opsQueryDiskExtModelResponse.setCategory(_ctx.stringValue("OpsQueryDiskExtModelResponse.Category"));
		opsQueryDiskExtModelResponse.setRegionId(_ctx.stringValue("OpsQueryDiskExtModelResponse.RegionId"));
		opsQueryDiskExtModelResponse.setZoneId(_ctx.stringValue("OpsQueryDiskExtModelResponse.ZoneId"));
		opsQueryDiskExtModelResponse.setClusterId(_ctx.stringValue("OpsQueryDiskExtModelResponse.ClusterId"));
		opsQueryDiskExtModelResponse.setDiskName(_ctx.stringValue("OpsQueryDiskExtModelResponse.DiskName"));
		opsQueryDiskExtModelResponse.setDescription(_ctx.stringValue("OpsQueryDiskExtModelResponse.Description"));
		opsQueryDiskExtModelResponse.setSize(_ctx.integerValue("OpsQueryDiskExtModelResponse.Size"));
		opsQueryDiskExtModelResponse.setActive(_ctx.booleanValue("OpsQueryDiskExtModelResponse.Active"));
		opsQueryDiskExtModelResponse.setBootable(_ctx.booleanValue("OpsQueryDiskExtModelResponse.Bootable"));
		opsQueryDiskExtModelResponse.setPortable(_ctx.booleanValue("OpsQueryDiskExtModelResponse.Portable"));
		opsQueryDiskExtModelResponse.setImageId(_ctx.stringValue("OpsQueryDiskExtModelResponse.ImageId"));
		opsQueryDiskExtModelResponse.setSnapshotId(_ctx.stringValue("OpsQueryDiskExtModelResponse.SnapshotId"));
		opsQueryDiskExtModelResponse.setAutoSnapshotPolicyId(_ctx.stringValue("OpsQueryDiskExtModelResponse.AutoSnapshotPolicyId"));
		opsQueryDiskExtModelResponse.setSnapshotLinkId(_ctx.stringValue("OpsQueryDiskExtModelResponse.SnapshotLinkId"));
		opsQueryDiskExtModelResponse.setInstanceId(_ctx.stringValue("OpsQueryDiskExtModelResponse.InstanceId"));
		opsQueryDiskExtModelResponse.setDevice(_ctx.stringValue("OpsQueryDiskExtModelResponse.Device"));
		opsQueryDiskExtModelResponse.setDeleteWithInstance(_ctx.booleanValue("OpsQueryDiskExtModelResponse.DeleteWithInstance"));
		opsQueryDiskExtModelResponse.setDeleteAutoSnapshot(_ctx.booleanValue("OpsQueryDiskExtModelResponse.DeleteAutoSnapshot"));
		opsQueryDiskExtModelResponse.setEnableAutoSnapshot(_ctx.booleanValue("OpsQueryDiskExtModelResponse.EnableAutoSnapshot"));
		opsQueryDiskExtModelResponse.setAttachedTime(_ctx.stringValue("OpsQueryDiskExtModelResponse.AttachedTime"));
		opsQueryDiskExtModelResponse.setDetachedTime(_ctx.stringValue("OpsQueryDiskExtModelResponse.DetachedTime"));
		opsQueryDiskExtModelResponse.setProductCode(_ctx.stringValue("OpsQueryDiskExtModelResponse.ProductCode"));
		opsQueryDiskExtModelResponse.setHouyiDiskId(_ctx.stringValue("OpsQueryDiskExtModelResponse.HouyiDiskId"));
		opsQueryDiskExtModelResponse.setNumericId(_ctx.longValue("OpsQueryDiskExtModelResponse.NumericId"));
		opsQueryDiskExtModelResponse.setBusinessStatus(_ctx.stringValue("OpsQueryDiskExtModelResponse.BusinessStatus"));
		opsQueryDiskExtModelResponse.setIopsSize(_ctx.integerValue("OpsQueryDiskExtModelResponse.IopsSize"));
		opsQueryDiskExtModelResponse.setCacheStatus(_ctx.stringValue("OpsQueryDiskExtModelResponse.CacheStatus"));
		opsQueryDiskExtModelResponse.setCacheSize(_ctx.stringValue("OpsQueryDiskExtModelResponse.CacheSize"));
		opsQueryDiskExtModelResponse.setIopsW(_ctx.stringValue("OpsQueryDiskExtModelResponse.IopsW"));
		opsQueryDiskExtModelResponse.setIopsR(_ctx.stringValue("OpsQueryDiskExtModelResponse.IopsR"));
		opsQueryDiskExtModelResponse.setBpsW(_ctx.stringValue("OpsQueryDiskExtModelResponse.BpsW"));
		opsQueryDiskExtModelResponse.setBpsR(_ctx.stringValue("OpsQueryDiskExtModelResponse.BpsR"));

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryDiskExtModelResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setTagKey(_ctx.stringValue("OpsQueryDiskExtModelResponse.Tags["+ i +"].TagKey"));
			tag.setTagValue(_ctx.stringValue("OpsQueryDiskExtModelResponse.Tags["+ i +"].TagValue"));

			tags.add(tag);
		}
		opsQueryDiskExtModelResponse.setTags(tags);
	 
	 	return opsQueryDiskExtModelResponse;
	}
}