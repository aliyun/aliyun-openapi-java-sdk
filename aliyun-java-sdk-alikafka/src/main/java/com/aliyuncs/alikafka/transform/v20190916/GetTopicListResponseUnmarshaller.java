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

package com.aliyuncs.alikafka.transform.v20190916;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alikafka.model.v20190916.GetTopicListResponse;
import com.aliyuncs.alikafka.model.v20190916.GetTopicListResponse.TopicVO;
import com.aliyuncs.alikafka.model.v20190916.GetTopicListResponse.TopicVO.TagVO;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTopicListResponseUnmarshaller {

	public static GetTopicListResponse unmarshall(GetTopicListResponse getTopicListResponse, UnmarshallerContext _ctx) {
		
		getTopicListResponse.setRequestId(_ctx.stringValue("GetTopicListResponse.RequestId"));
		getTopicListResponse.setSuccess(_ctx.booleanValue("GetTopicListResponse.Success"));
		getTopicListResponse.setCode(_ctx.integerValue("GetTopicListResponse.Code"));
		getTopicListResponse.setMessage(_ctx.stringValue("GetTopicListResponse.Message"));
		getTopicListResponse.setTotal(_ctx.integerValue("GetTopicListResponse.Total"));
		getTopicListResponse.setPageSize(_ctx.integerValue("GetTopicListResponse.PageSize"));
		getTopicListResponse.setCurrentPage(_ctx.integerValue("GetTopicListResponse.CurrentPage"));

		List<TopicVO> topicList = new ArrayList<TopicVO>();
		for (int i = 0; i < _ctx.lengthValue("GetTopicListResponse.TopicList.Length"); i++) {
			TopicVO topicVO = new TopicVO();
			topicVO.setTopic(_ctx.stringValue("GetTopicListResponse.TopicList["+ i +"].Topic"));
			topicVO.setCreateTime(_ctx.longValue("GetTopicListResponse.TopicList["+ i +"].CreateTime"));
			topicVO.setRemark(_ctx.stringValue("GetTopicListResponse.TopicList["+ i +"].Remark"));
			topicVO.setStatus(_ctx.integerValue("GetTopicListResponse.TopicList["+ i +"].Status"));
			topicVO.setInstanceId(_ctx.stringValue("GetTopicListResponse.TopicList["+ i +"].InstanceId"));
			topicVO.setRegionId(_ctx.stringValue("GetTopicListResponse.TopicList["+ i +"].RegionId"));
			topicVO.setStatusName(_ctx.stringValue("GetTopicListResponse.TopicList["+ i +"].StatusName"));
			topicVO.setCompactTopic(_ctx.booleanValue("GetTopicListResponse.TopicList["+ i +"].CompactTopic"));
			topicVO.setLocalTopic(_ctx.booleanValue("GetTopicListResponse.TopicList["+ i +"].LocalTopic"));
			topicVO.setPartitionNum(_ctx.integerValue("GetTopicListResponse.TopicList["+ i +"].PartitionNum"));

			List<TagVO> tags = new ArrayList<TagVO>();
			for (int j = 0; j < _ctx.lengthValue("GetTopicListResponse.TopicList["+ i +"].Tags.Length"); j++) {
				TagVO tagVO = new TagVO();
				tagVO.setKey(_ctx.stringValue("GetTopicListResponse.TopicList["+ i +"].Tags["+ j +"].Key"));
				tagVO.setValue(_ctx.stringValue("GetTopicListResponse.TopicList["+ i +"].Tags["+ j +"].Value"));

				tags.add(tagVO);
			}
			topicVO.setTags(tags);

			topicList.add(topicVO);
		}
		getTopicListResponse.setTopicList(topicList);
	 
	 	return getTopicListResponse;
	}
}