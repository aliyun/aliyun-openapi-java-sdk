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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeStreamLocationBlockResponse;
import com.aliyuncs.live.model.v20161101.DescribeStreamLocationBlockResponse.StreamBlock;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStreamLocationBlockResponseUnmarshaller {

	public static DescribeStreamLocationBlockResponse unmarshall(DescribeStreamLocationBlockResponse describeStreamLocationBlockResponse, UnmarshallerContext _ctx) {
		
		describeStreamLocationBlockResponse.setRequestId(_ctx.stringValue("DescribeStreamLocationBlockResponse.RequestId"));
		describeStreamLocationBlockResponse.setCount(_ctx.integerValue("DescribeStreamLocationBlockResponse.Count"));
		describeStreamLocationBlockResponse.setPageNum(_ctx.integerValue("DescribeStreamLocationBlockResponse.PageNum"));
		describeStreamLocationBlockResponse.setPageSize(_ctx.integerValue("DescribeStreamLocationBlockResponse.PageSize"));
		describeStreamLocationBlockResponse.setTotalPage(_ctx.integerValue("DescribeStreamLocationBlockResponse.TotalPage"));

		List<StreamBlock> streamBlockList = new ArrayList<StreamBlock>();
		for (int i = 0; i < _ctx.lengthValue("DescribeStreamLocationBlockResponse.StreamBlockList.Length"); i++) {
			StreamBlock streamBlock = new StreamBlock();
			streamBlock.setAppName(_ctx.stringValue("DescribeStreamLocationBlockResponse.StreamBlockList["+ i +"].AppName"));
			streamBlock.setBlockType(_ctx.stringValue("DescribeStreamLocationBlockResponse.StreamBlockList["+ i +"].BlockType"));
			streamBlock.setDomainName(_ctx.stringValue("DescribeStreamLocationBlockResponse.StreamBlockList["+ i +"].DomainName"));
			streamBlock.setLocationList(_ctx.stringValue("DescribeStreamLocationBlockResponse.StreamBlockList["+ i +"].LocationList"));
			streamBlock.setReleaseTime(_ctx.stringValue("DescribeStreamLocationBlockResponse.StreamBlockList["+ i +"].ReleaseTime"));
			streamBlock.setStatus(_ctx.integerValue("DescribeStreamLocationBlockResponse.StreamBlockList["+ i +"].Status"));
			streamBlock.setStreamName(_ctx.stringValue("DescribeStreamLocationBlockResponse.StreamBlockList["+ i +"].StreamName"));
			streamBlock.setUpdateTime(_ctx.stringValue("DescribeStreamLocationBlockResponse.StreamBlockList["+ i +"].UpdateTime"));

			streamBlockList.add(streamBlock);
		}
		describeStreamLocationBlockResponse.setStreamBlockList(streamBlockList);
	 
	 	return describeStreamLocationBlockResponse;
	}
}