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

package com.aliyuncs.hbr.transform.v20170908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.DescribeHanaMetadataResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeHanaMetadataResponse.HanaMetadataItem;
import com.aliyuncs.hbr.model.v20170908.DescribeHanaMetadataResponse.NextStartKey;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHanaMetadataResponseUnmarshaller {

	public static DescribeHanaMetadataResponse unmarshall(DescribeHanaMetadataResponse describeHanaMetadataResponse, UnmarshallerContext _ctx) {
		
		describeHanaMetadataResponse.setRequestId(_ctx.stringValue("DescribeHanaMetadataResponse.RequestId"));
		describeHanaMetadataResponse.setSuccess(_ctx.booleanValue("DescribeHanaMetadataResponse.Success"));
		describeHanaMetadataResponse.setCode(_ctx.stringValue("DescribeHanaMetadataResponse.Code"));
		describeHanaMetadataResponse.setMessage(_ctx.stringValue("DescribeHanaMetadataResponse.Message"));

		NextStartKey nextStartKey = new NextStartKey();
		nextStartKey.setClusterId(_ctx.stringValue("DescribeHanaMetadataResponse.NextStartKey.ClusterId"));
		nextStartKey.setSid(_ctx.stringValue("DescribeHanaMetadataResponse.NextStartKey.Sid"));
		nextStartKey.setTags(_ctx.stringValue("DescribeHanaMetadataResponse.NextStartKey.Tags"));
		nextStartKey.setPaths(_ctx.stringValue("DescribeHanaMetadataResponse.NextStartKey.Paths"));
		nextStartKey.setSnapshotId(_ctx.stringValue("DescribeHanaMetadataResponse.NextStartKey.SnapshotId"));
		describeHanaMetadataResponse.setNextStartKey(nextStartKey);

		List<HanaMetadataItem> hanaMetadata = new ArrayList<HanaMetadataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHanaMetadataResponse.HanaMetadata.Length"); i++) {
			HanaMetadataItem hanaMetadataItem = new HanaMetadataItem();
			hanaMetadataItem.setClusterId(_ctx.stringValue("DescribeHanaMetadataResponse.HanaMetadata["+ i +"].ClusterId"));
			hanaMetadataItem.setSid(_ctx.stringValue("DescribeHanaMetadataResponse.HanaMetadata["+ i +"].Sid"));
			hanaMetadataItem.setTags(_ctx.stringValue("DescribeHanaMetadataResponse.HanaMetadata["+ i +"].Tags"));
			hanaMetadataItem.setPaths(_ctx.stringValue("DescribeHanaMetadataResponse.HanaMetadata["+ i +"].Paths"));
			hanaMetadataItem.setSnapshotId(_ctx.stringValue("DescribeHanaMetadataResponse.HanaMetadata["+ i +"].SnapshotId"));
			hanaMetadataItem.setUpdatedTime(_ctx.longValue("DescribeHanaMetadataResponse.HanaMetadata["+ i +"].UpdatedTime"));

			hanaMetadata.add(hanaMetadataItem);
		}
		describeHanaMetadataResponse.setHanaMetadata(hanaMetadata);
	 
	 	return describeHanaMetadataResponse;
	}
}