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

import com.aliyuncs.alikafka.model.v20190916.QueryMessageResponse;
import com.aliyuncs.alikafka.model.v20190916.QueryMessageResponse.MessageVO;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMessageResponseUnmarshaller {

	public static QueryMessageResponse unmarshall(QueryMessageResponse queryMessageResponse, UnmarshallerContext _ctx) {
		
		queryMessageResponse.setRequestId(_ctx.stringValue("QueryMessageResponse.RequestId"));
		queryMessageResponse.setCode(_ctx.integerValue("QueryMessageResponse.Code"));
		queryMessageResponse.setMessage(_ctx.stringValue("QueryMessageResponse.Message"));
		queryMessageResponse.setSuccess(_ctx.booleanValue("QueryMessageResponse.Success"));

		List<MessageVO> messageList = new ArrayList<MessageVO>();
		for (int i = 0; i < _ctx.lengthValue("QueryMessageResponse.MessageList.Length"); i++) {
			MessageVO messageVO = new MessageVO();
			messageVO.setTopic(_ctx.stringValue("QueryMessageResponse.MessageList["+ i +"].Topic"));
			messageVO.setPartition(_ctx.longValue("QueryMessageResponse.MessageList["+ i +"].Partition"));
			messageVO.setOffset(_ctx.longValue("QueryMessageResponse.MessageList["+ i +"].Offset"));
			messageVO.setTimestamp(_ctx.longValue("QueryMessageResponse.MessageList["+ i +"].Timestamp"));
			messageVO.setTimestampType(_ctx.stringValue("QueryMessageResponse.MessageList["+ i +"].TimestampType"));
			messageVO.setChecksum(_ctx.longValue("QueryMessageResponse.MessageList["+ i +"].Checksum"));
			messageVO.setSerializedKeySize(_ctx.integerValue("QueryMessageResponse.MessageList["+ i +"].SerializedKeySize"));
			messageVO.setSerializedValueSize(_ctx.integerValue("QueryMessageResponse.MessageList["+ i +"].SerializedValueSize"));
			messageVO.setKey(_ctx.stringValue("QueryMessageResponse.MessageList["+ i +"].Key"));
			messageVO.setValue(_ctx.stringValue("QueryMessageResponse.MessageList["+ i +"].Value"));
			messageVO.setKeyTruncated(_ctx.booleanValue("QueryMessageResponse.MessageList["+ i +"].KeyTruncated"));
			messageVO.setValueTruncated(_ctx.booleanValue("QueryMessageResponse.MessageList["+ i +"].ValueTruncated"));
			messageVO.setTruncatedKeySize(_ctx.integerValue("QueryMessageResponse.MessageList["+ i +"].TruncatedKeySize"));
			messageVO.setTruncatedValueSize(_ctx.integerValue("QueryMessageResponse.MessageList["+ i +"].TruncatedValueSize"));

			messageList.add(messageVO);
		}
		queryMessageResponse.setMessageList(messageList);
	 
	 	return queryMessageResponse;
	}
}