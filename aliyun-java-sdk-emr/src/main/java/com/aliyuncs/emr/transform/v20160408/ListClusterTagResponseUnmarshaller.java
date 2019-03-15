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

import com.aliyuncs.emr.model.v20160408.ListClusterTagResponse;
import com.aliyuncs.emr.model.v20160408.ListClusterTagResponse.ClusterTag;
import com.aliyuncs.emr.model.v20160408.ListClusterTagResponse.ClusterTag.TagInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterTagResponseUnmarshaller {

	public static ListClusterTagResponse unmarshall(ListClusterTagResponse listClusterTagResponse, UnmarshallerContext context) {
		
		listClusterTagResponse.setRequestId(context.stringValue("ListClusterTagResponse.RequestId"));

		List<ClusterTag> clusterTagList = new ArrayList<ClusterTag>();
		for (int i = 0; i < context.lengthValue("ListClusterTagResponse.ClusterTagList.Length"); i++) {
			ClusterTag clusterTag = new ClusterTag();
			clusterTag.setClusterId(context.stringValue("ListClusterTagResponse.ClusterTagList["+ i +"].ClusterId"));

			List<TagInfo> tagInfoList = new ArrayList<TagInfo>();
			for (int j = 0; j < context.lengthValue("ListClusterTagResponse.ClusterTagList["+ i +"].TagInfoList.Length"); j++) {
				TagInfo tagInfo = new TagInfo();
				tagInfo.setTagType(context.stringValue("ListClusterTagResponse.ClusterTagList["+ i +"].TagInfoList["+ j +"].TagType"));
				tagInfo.setTagValue(context.stringValue("ListClusterTagResponse.ClusterTagList["+ i +"].TagInfoList["+ j +"].TagValue"));
				tagInfo.setTagKey(context.stringValue("ListClusterTagResponse.ClusterTagList["+ i +"].TagInfoList["+ j +"].TagKey"));

				tagInfoList.add(tagInfo);
			}
			clusterTag.setTagInfoList(tagInfoList);

			clusterTagList.add(clusterTag);
		}
		listClusterTagResponse.setClusterTagList(clusterTagList);
	 
	 	return listClusterTagResponse;
	}
}