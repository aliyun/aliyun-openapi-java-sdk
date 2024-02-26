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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.DescribeDesktopOversoldGroupResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeDesktopOversoldGroupResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDesktopOversoldGroupResponseUnmarshaller {

	public static DescribeDesktopOversoldGroupResponse unmarshall(DescribeDesktopOversoldGroupResponse describeDesktopOversoldGroupResponse, UnmarshallerContext _ctx) {
		
		describeDesktopOversoldGroupResponse.setRequestId(_ctx.stringValue("DescribeDesktopOversoldGroupResponse.RequestId"));
		describeDesktopOversoldGroupResponse.setCount(_ctx.integerValue("DescribeDesktopOversoldGroupResponse.Count"));
		describeDesktopOversoldGroupResponse.setNextToken(_ctx.stringValue("DescribeDesktopOversoldGroupResponse.NextToken"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDesktopOversoldGroupResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setDirectoryId(_ctx.stringValue("DescribeDesktopOversoldGroupResponse.Data["+ i +"].DirectoryId"));
			dataItem.setOversoldGroupId(_ctx.stringValue("DescribeDesktopOversoldGroupResponse.Data["+ i +"].OversoldGroupId"));
			dataItem.setName(_ctx.stringValue("DescribeDesktopOversoldGroupResponse.Data["+ i +"].Name"));
			dataItem.setDesktopType(_ctx.stringValue("DescribeDesktopOversoldGroupResponse.Data["+ i +"].DesktopType"));
			dataItem.setSystemDiskSize(_ctx.integerValue("DescribeDesktopOversoldGroupResponse.Data["+ i +"].SystemDiskSize"));
			dataItem.setDataDiskSize(_ctx.integerValue("DescribeDesktopOversoldGroupResponse.Data["+ i +"].DataDiskSize"));
			dataItem.setImageId(_ctx.stringValue("DescribeDesktopOversoldGroupResponse.Data["+ i +"].ImageId"));
			dataItem.setPolicyGroupId(_ctx.stringValue("DescribeDesktopOversoldGroupResponse.Data["+ i +"].PolicyGroupId"));
			dataItem.setConcurrenceCount(_ctx.integerValue("DescribeDesktopOversoldGroupResponse.Data["+ i +"].ConcurrenceCount"));
			dataItem.setOversoldUserCount(_ctx.integerValue("DescribeDesktopOversoldGroupResponse.Data["+ i +"].OversoldUserCount"));
			dataItem.setStopDuration(_ctx.longValue("DescribeDesktopOversoldGroupResponse.Data["+ i +"].StopDuration"));
			dataItem.setOversoldWarn(_ctx.integerValue("DescribeDesktopOversoldGroupResponse.Data["+ i +"].OversoldWarn"));
			dataItem.setStatus(_ctx.stringValue("DescribeDesktopOversoldGroupResponse.Data["+ i +"].Status"));
			dataItem.setSaleStatus(_ctx.stringValue("DescribeDesktopOversoldGroupResponse.Data["+ i +"].SaleStatus"));
			dataItem.setExpireTime(_ctx.stringValue("DescribeDesktopOversoldGroupResponse.Data["+ i +"].ExpireTime"));
			dataItem.setDescription(_ctx.stringValue("DescribeDesktopOversoldGroupResponse.Data["+ i +"].Description"));
			dataItem.setCurConcurrenceCount(_ctx.integerValue("DescribeDesktopOversoldGroupResponse.Data["+ i +"].CurConcurrenceCount"));

			data.add(dataItem);
		}
		describeDesktopOversoldGroupResponse.setData(data);
	 
	 	return describeDesktopOversoldGroupResponse;
	}
}