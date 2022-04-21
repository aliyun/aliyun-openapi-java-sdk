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

package com.aliyuncs.vs.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vs.model.v20181212.DescribeStreamsResponse;
import com.aliyuncs.vs.model.v20181212.DescribeStreamsResponse.Stream;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStreamsResponseUnmarshaller {

	public static DescribeStreamsResponse unmarshall(DescribeStreamsResponse describeStreamsResponse, UnmarshallerContext _ctx) {
		
		describeStreamsResponse.setRequestId(_ctx.stringValue("DescribeStreamsResponse.RequestId"));
		describeStreamsResponse.setPageNum(_ctx.longValue("DescribeStreamsResponse.PageNum"));
		describeStreamsResponse.setPageSize(_ctx.longValue("DescribeStreamsResponse.PageSize"));
		describeStreamsResponse.setTotalCount(_ctx.longValue("DescribeStreamsResponse.TotalCount"));
		describeStreamsResponse.setPageCount(_ctx.longValue("DescribeStreamsResponse.PageCount"));

		List<Stream> streams = new ArrayList<Stream>();
		for (int i = 0; i < _ctx.lengthValue("DescribeStreamsResponse.Streams.Length"); i++) {
			Stream stream = new Stream();
			stream.setStatus(_ctx.stringValue("DescribeStreamsResponse.Streams["+ i +"].Status"));
			stream.setPlayDomain(_ctx.stringValue("DescribeStreamsResponse.Streams["+ i +"].PlayDomain"));
			stream.setBizProtocol(_ctx.stringValue("DescribeStreamsResponse.Streams["+ i +"].Protocol"));
			stream.setDeviceId(_ctx.stringValue("DescribeStreamsResponse.Streams["+ i +"].DeviceId"));
			stream.setHeight(_ctx.integerValue("DescribeStreamsResponse.Streams["+ i +"].Height"));
			stream.setGroupId(_ctx.stringValue("DescribeStreamsResponse.Streams["+ i +"].GroupId"));
			stream.setApp(_ctx.stringValue("DescribeStreamsResponse.Streams["+ i +"].App"));
			stream.setWidth(_ctx.integerValue("DescribeStreamsResponse.Streams["+ i +"].Width"));
			stream.setEnabled(_ctx.booleanValue("DescribeStreamsResponse.Streams["+ i +"].Enabled"));
			stream.setName(_ctx.stringValue("DescribeStreamsResponse.Streams["+ i +"].Name"));
			stream.setPushDomain(_ctx.stringValue("DescribeStreamsResponse.Streams["+ i +"].PushDomain"));
			stream.setCreatedTime(_ctx.stringValue("DescribeStreamsResponse.Streams["+ i +"].CreatedTime"));
			stream.setId(_ctx.stringValue("DescribeStreamsResponse.Streams["+ i +"].Id"));

			streams.add(stream);
		}
		describeStreamsResponse.setStreams(streams);
	 
	 	return describeStreamsResponse;
	}
}