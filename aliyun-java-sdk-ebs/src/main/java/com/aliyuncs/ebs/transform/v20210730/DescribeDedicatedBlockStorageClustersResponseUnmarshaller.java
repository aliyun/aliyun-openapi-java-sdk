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

package com.aliyuncs.ebs.transform.v20210730;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ebs.model.v20210730.DescribeDedicatedBlockStorageClustersResponse;
import com.aliyuncs.ebs.model.v20210730.DescribeDedicatedBlockStorageClustersResponse.Dbsc;
import com.aliyuncs.ebs.model.v20210730.DescribeDedicatedBlockStorageClustersResponse.Dbsc.DedicatedBlockStorageClusterCapacity;
import com.aliyuncs.ebs.model.v20210730.DescribeDedicatedBlockStorageClustersResponse.Dbsc.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDedicatedBlockStorageClustersResponseUnmarshaller {

	public static DescribeDedicatedBlockStorageClustersResponse unmarshall(DescribeDedicatedBlockStorageClustersResponse describeDedicatedBlockStorageClustersResponse, UnmarshallerContext _ctx) {
		
		describeDedicatedBlockStorageClustersResponse.setRequestId(_ctx.stringValue("DescribeDedicatedBlockStorageClustersResponse.RequestId"));
		describeDedicatedBlockStorageClustersResponse.setNextToken(_ctx.stringValue("DescribeDedicatedBlockStorageClustersResponse.NextToken"));
		describeDedicatedBlockStorageClustersResponse.setPageNumber(_ctx.integerValue("DescribeDedicatedBlockStorageClustersResponse.PageNumber"));
		describeDedicatedBlockStorageClustersResponse.setPageSize(_ctx.integerValue("DescribeDedicatedBlockStorageClustersResponse.PageSize"));
		describeDedicatedBlockStorageClustersResponse.setTotalCount(_ctx.longValue("DescribeDedicatedBlockStorageClustersResponse.TotalCount"));

		List<Dbsc> dedicatedBlockStorageClusters = new ArrayList<Dbsc>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDedicatedBlockStorageClustersResponse.DedicatedBlockStorageClusters.Length"); i++) {
			Dbsc dbsc = new Dbsc();
			dbsc.setDedicatedBlockStorageClusterId(_ctx.stringValue("DescribeDedicatedBlockStorageClustersResponse.DedicatedBlockStorageClusters["+ i +"].DedicatedBlockStorageClusterId"));
			dbsc.setDedicatedBlockStorageClusterName(_ctx.stringValue("DescribeDedicatedBlockStorageClustersResponse.DedicatedBlockStorageClusters["+ i +"].DedicatedBlockStorageClusterName"));
			dbsc.setDescription(_ctx.stringValue("DescribeDedicatedBlockStorageClustersResponse.DedicatedBlockStorageClusters["+ i +"].Description"));
			dbsc.setRegionId(_ctx.stringValue("DescribeDedicatedBlockStorageClustersResponse.DedicatedBlockStorageClusters["+ i +"].RegionId"));
			dbsc.setZoneId(_ctx.stringValue("DescribeDedicatedBlockStorageClustersResponse.DedicatedBlockStorageClusters["+ i +"].ZoneId"));
			dbsc.setStatus(_ctx.stringValue("DescribeDedicatedBlockStorageClustersResponse.DedicatedBlockStorageClusters["+ i +"].Status"));
			dbsc.setCategory(_ctx.stringValue("DescribeDedicatedBlockStorageClustersResponse.DedicatedBlockStorageClusters["+ i +"].Category"));
			dbsc.setType(_ctx.stringValue("DescribeDedicatedBlockStorageClustersResponse.DedicatedBlockStorageClusters["+ i +"].Type"));
			dbsc.setPerformanceLevel(_ctx.stringValue("DescribeDedicatedBlockStorageClustersResponse.DedicatedBlockStorageClusters["+ i +"].PerformanceLevel"));
			dbsc.setSupportedCategory(_ctx.stringValue("DescribeDedicatedBlockStorageClustersResponse.DedicatedBlockStorageClusters["+ i +"].SupportedCategory"));
			dbsc.setCreateTime(_ctx.stringValue("DescribeDedicatedBlockStorageClustersResponse.DedicatedBlockStorageClusters["+ i +"].CreateTime"));
			dbsc.setExpiredTime(_ctx.stringValue("DescribeDedicatedBlockStorageClustersResponse.DedicatedBlockStorageClusters["+ i +"].ExpiredTime"));
			dbsc.setResourceGroupId(_ctx.stringValue("DescribeDedicatedBlockStorageClustersResponse.DedicatedBlockStorageClusters["+ i +"].ResourceGroupId"));

			DedicatedBlockStorageClusterCapacity dedicatedBlockStorageClusterCapacity = new DedicatedBlockStorageClusterCapacity();
			dedicatedBlockStorageClusterCapacity.setAvailableCapacity(_ctx.longValue("DescribeDedicatedBlockStorageClustersResponse.DedicatedBlockStorageClusters["+ i +"].DedicatedBlockStorageClusterCapacity.AvailableCapacity"));
			dedicatedBlockStorageClusterCapacity.setTotalCapacity(_ctx.longValue("DescribeDedicatedBlockStorageClustersResponse.DedicatedBlockStorageClusters["+ i +"].DedicatedBlockStorageClusterCapacity.TotalCapacity"));
			dedicatedBlockStorageClusterCapacity.setDeliveryCapacity(_ctx.longValue("DescribeDedicatedBlockStorageClustersResponse.DedicatedBlockStorageClusters["+ i +"].DedicatedBlockStorageClusterCapacity.DeliveryCapacity"));
			dedicatedBlockStorageClusterCapacity.setUsedCapacity(_ctx.longValue("DescribeDedicatedBlockStorageClustersResponse.DedicatedBlockStorageClusters["+ i +"].DedicatedBlockStorageClusterCapacity.UsedCapacity"));
			dbsc.setDedicatedBlockStorageClusterCapacity(dedicatedBlockStorageClusterCapacity);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDedicatedBlockStorageClustersResponse.DedicatedBlockStorageClusters["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("DescribeDedicatedBlockStorageClustersResponse.DedicatedBlockStorageClusters["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("DescribeDedicatedBlockStorageClustersResponse.DedicatedBlockStorageClusters["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			dbsc.setTags(tags);

			dedicatedBlockStorageClusters.add(dbsc);
		}
		describeDedicatedBlockStorageClustersResponse.setDedicatedBlockStorageClusters(dedicatedBlockStorageClusters);
	 
	 	return describeDedicatedBlockStorageClustersResponse;
	}
}