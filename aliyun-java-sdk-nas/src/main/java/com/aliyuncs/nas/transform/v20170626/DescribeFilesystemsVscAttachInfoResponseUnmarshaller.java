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

package com.aliyuncs.nas.transform.v20170626;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nas.model.v20170626.DescribeFilesystemsVscAttachInfoResponse;
import com.aliyuncs.nas.model.v20170626.DescribeFilesystemsVscAttachInfoResponse.VscAttachInfoItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFilesystemsVscAttachInfoResponseUnmarshaller {

	public static DescribeFilesystemsVscAttachInfoResponse unmarshall(DescribeFilesystemsVscAttachInfoResponse describeFilesystemsVscAttachInfoResponse, UnmarshallerContext _ctx) {
		
		describeFilesystemsVscAttachInfoResponse.setRequestId(_ctx.stringValue("DescribeFilesystemsVscAttachInfoResponse.RequestId"));
		describeFilesystemsVscAttachInfoResponse.setNextToken(_ctx.stringValue("DescribeFilesystemsVscAttachInfoResponse.NextToken"));
		describeFilesystemsVscAttachInfoResponse.setTotalCount(_ctx.integerValue("DescribeFilesystemsVscAttachInfoResponse.TotalCount"));
		describeFilesystemsVscAttachInfoResponse.setMaxResults(_ctx.integerValue("DescribeFilesystemsVscAttachInfoResponse.MaxResults"));

		List<VscAttachInfoItem> vscAttachInfo = new ArrayList<VscAttachInfoItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFilesystemsVscAttachInfoResponse.VscAttachInfo.Length"); i++) {
			VscAttachInfoItem vscAttachInfoItem = new VscAttachInfoItem();
			vscAttachInfoItem.setFileSystemId(_ctx.stringValue("DescribeFilesystemsVscAttachInfoResponse.VscAttachInfo["+ i +"].FileSystemId"));
			vscAttachInfoItem.setVscId(_ctx.stringValue("DescribeFilesystemsVscAttachInfoResponse.VscAttachInfo["+ i +"].VscId"));
			vscAttachInfoItem.setStatus(_ctx.stringValue("DescribeFilesystemsVscAttachInfoResponse.VscAttachInfo["+ i +"].Status"));

			vscAttachInfo.add(vscAttachInfoItem);
		}
		describeFilesystemsVscAttachInfoResponse.setVscAttachInfo(vscAttachInfo);
	 
	 	return describeFilesystemsVscAttachInfoResponse;
	}
}