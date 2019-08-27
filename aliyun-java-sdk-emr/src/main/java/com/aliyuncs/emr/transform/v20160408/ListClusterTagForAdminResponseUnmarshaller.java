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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListClusterTagForAdminResponse;
import com.aliyuncs.emr.model.v20160408.ListClusterTagForAdminResponse.ClusterTag;
import com.aliyuncs.emr.model.v20160408.ListClusterTagForAdminResponse.ClusterTag.TagInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterTagForAdminResponseUnmarshaller {

	public static ListClusterTagForAdminResponse unmarshall(ListClusterTagForAdminResponse listClusterTagForAdminResponse, UnmarshallerContext _ctx) {
		
		listClusterTagForAdminResponse.setRequestId(_ctx.stringValue("ListClusterTagForAdminResponse.RequestId"));

		List<ClusterTag> clusterTagList = new ArrayList<ClusterTag>();
		for (int i = 0; i < _ctx.lengthValue("ListClusterTagForAdminResponse.ClusterTagList.Length"); i++) {
			ClusterTag clusterTag = new ClusterTag();
			clusterTag.setClusterId(_ctx.stringValue("ListClusterTagForAdminResponse.ClusterTagList["+ i +"].ClusterId"));

			List<TagInfo> tagInfoList = new ArrayList<TagInfo>();
			for (int j = 0; j < _ctx.lengthValue("ListClusterTagForAdminResponse.ClusterTagList["+ i +"].TagInfoList.Length"); j++) {
				TagInfo tagInfo = new TagInfo();
				tagInfo.setTagType(_ctx.stringValue("ListClusterTagForAdminResponse.ClusterTagList["+ i +"].TagInfoList["+ j +"].TagType"));
				tagInfo.setTagValue(_ctx.stringValue("ListClusterTagForAdminResponse.ClusterTagList["+ i +"].TagInfoList["+ j +"].TagValue"));
				tagInfo.setTagKey(_ctx.stringValue("ListClusterTagForAdminResponse.ClusterTagList["+ i +"].TagInfoList["+ j +"].TagKey"));

				tagInfoList.add(tagInfo);
			}
			clusterTag.setTagInfoList(tagInfoList);

			clusterTagList.add(clusterTag);
		}
		listClusterTagForAdminResponse.setClusterTagList(clusterTagList);
	 
	 	return listClusterTagForAdminResponse;
	}
}