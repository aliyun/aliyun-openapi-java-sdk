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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeSDGResponse;
import com.aliyuncs.ens.model.v20171110.DescribeSDGResponse.SDGsItem;
import com.aliyuncs.ens.model.v20171110.DescribeSDGResponse.SDGsItem.AvaliableRegionIdsItem;
import com.aliyuncs.ens.model.v20171110.DescribeSDGResponse.SDGsItem.PreloadInfosItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSDGResponseUnmarshaller {

	public static DescribeSDGResponse unmarshall(DescribeSDGResponse describeSDGResponse, UnmarshallerContext _ctx) {
		
		describeSDGResponse.setRequestId(_ctx.stringValue("DescribeSDGResponse.RequestId"));
		describeSDGResponse.setPageNumber(_ctx.integerValue("DescribeSDGResponse.PageNumber"));
		describeSDGResponse.setPageSize(_ctx.integerValue("DescribeSDGResponse.PageSize"));
		describeSDGResponse.setTotalCount(_ctx.integerValue("DescribeSDGResponse.TotalCount"));

		List<SDGsItem> sDGs = new ArrayList<SDGsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSDGResponse.SDGs.Length"); i++) {
			SDGsItem sDGsItem = new SDGsItem();
			sDGsItem.setCreationInstanceId(_ctx.stringValue("DescribeSDGResponse.SDGs["+ i +"].CreationInstanceId"));
			sDGsItem.setCreationRegionId(_ctx.stringValue("DescribeSDGResponse.SDGs["+ i +"].CreationRegionId"));
			sDGsItem.setCreationTime(_ctx.stringValue("DescribeSDGResponse.SDGs["+ i +"].CreationTime"));
			sDGsItem.setDescription(_ctx.stringValue("DescribeSDGResponse.SDGs["+ i +"].Description"));
			sDGsItem.setParentSDGId(_ctx.stringValue("DescribeSDGResponse.SDGs["+ i +"].ParentSDGId"));
			sDGsItem.setSDGId(_ctx.stringValue("DescribeSDGResponse.SDGs["+ i +"].SDGId"));
			sDGsItem.setSize(_ctx.longValue("DescribeSDGResponse.SDGs["+ i +"].Size"));
			sDGsItem.setStatus(_ctx.stringValue("DescribeSDGResponse.SDGs["+ i +"].Status"));
			sDGsItem.setUpdateTime(_ctx.stringValue("DescribeSDGResponse.SDGs["+ i +"].UpdateTime"));

			List<AvaliableRegionIdsItem> avaliableRegionIds = new ArrayList<AvaliableRegionIdsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSDGResponse.SDGs["+ i +"].AvaliableRegionIds.Length"); j++) {
				AvaliableRegionIdsItem avaliableRegionIdsItem = new AvaliableRegionIdsItem();
				avaliableRegionIdsItem.setCreationTime(_ctx.stringValue("DescribeSDGResponse.SDGs["+ i +"].AvaliableRegionIds["+ j +"].CreationTime"));
				avaliableRegionIdsItem.setRegionId(_ctx.stringValue("DescribeSDGResponse.SDGs["+ i +"].AvaliableRegionIds["+ j +"].RegionId"));
				avaliableRegionIdsItem.setSnapshotId(_ctx.stringValue("DescribeSDGResponse.SDGs["+ i +"].AvaliableRegionIds["+ j +"].SnapshotId"));
				avaliableRegionIdsItem.setStatus(_ctx.stringValue("DescribeSDGResponse.SDGs["+ i +"].AvaliableRegionIds["+ j +"].Status"));

				avaliableRegionIds.add(avaliableRegionIdsItem);
			}
			sDGsItem.setAvaliableRegionIds(avaliableRegionIds);

			List<PreloadInfosItem> preloadInfos = new ArrayList<PreloadInfosItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSDGResponse.SDGs["+ i +"].PreloadInfos.Length"); j++) {
				PreloadInfosItem preloadInfosItem = new PreloadInfosItem();
				preloadInfosItem.setRegionId(_ctx.stringValue("DescribeSDGResponse.SDGs["+ i +"].PreloadInfos["+ j +"].RegionId"));
				preloadInfosItem.setNamespace(_ctx.stringValue("DescribeSDGResponse.SDGs["+ i +"].PreloadInfos["+ j +"].Namespace"));
				preloadInfosItem.setRedundantNum(_ctx.integerValue("DescribeSDGResponse.SDGs["+ i +"].PreloadInfos["+ j +"].RedundantNum"));
				preloadInfosItem.setCreationTime(_ctx.stringValue("DescribeSDGResponse.SDGs["+ i +"].PreloadInfos["+ j +"].CreationTime"));
				preloadInfosItem.setUpdateTime(_ctx.stringValue("DescribeSDGResponse.SDGs["+ i +"].PreloadInfos["+ j +"].UpdateTime"));

				preloadInfos.add(preloadInfosItem);
			}
			sDGsItem.setPreloadInfos(preloadInfos);

			sDGs.add(sDGsItem);
		}
		describeSDGResponse.setSDGs(sDGs);
	 
	 	return describeSDGResponse;
	}
}