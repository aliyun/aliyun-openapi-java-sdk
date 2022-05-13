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

import com.aliyuncs.ecd.model.v20200930.DescribeImageModifiedRecordsResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeImageModifiedRecordsResponse.ImageModifiedRecord;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImageModifiedRecordsResponseUnmarshaller {

	public static DescribeImageModifiedRecordsResponse unmarshall(DescribeImageModifiedRecordsResponse describeImageModifiedRecordsResponse, UnmarshallerContext _ctx) {
		
		describeImageModifiedRecordsResponse.setRequestId(_ctx.stringValue("DescribeImageModifiedRecordsResponse.RequestId"));
		describeImageModifiedRecordsResponse.setNextToken(_ctx.stringValue("DescribeImageModifiedRecordsResponse.NextToken"));
		describeImageModifiedRecordsResponse.setTotalCount(_ctx.integerValue("DescribeImageModifiedRecordsResponse.TotalCount"));

		List<ImageModifiedRecord> imageModifiedRecords = new ArrayList<ImageModifiedRecord>();
		for (int i = 0; i < _ctx.lengthValue("DescribeImageModifiedRecordsResponse.ImageModifiedRecords.Length"); i++) {
			ImageModifiedRecord imageModifiedRecord = new ImageModifiedRecord();
			imageModifiedRecord.setStatus(_ctx.integerValue("DescribeImageModifiedRecordsResponse.ImageModifiedRecords["+ i +"].Status"));
			imageModifiedRecord.setUpdateTime(_ctx.stringValue("DescribeImageModifiedRecordsResponse.ImageModifiedRecords["+ i +"].UpdateTime"));
			imageModifiedRecord.setNewImageName(_ctx.stringValue("DescribeImageModifiedRecordsResponse.ImageModifiedRecords["+ i +"].NewImageName"));
			imageModifiedRecord.setImageName(_ctx.stringValue("DescribeImageModifiedRecordsResponse.ImageModifiedRecords["+ i +"].ImageName"));
			imageModifiedRecord.setNewImageId(_ctx.stringValue("DescribeImageModifiedRecordsResponse.ImageModifiedRecords["+ i +"].NewImageId"));
			imageModifiedRecord.setImageId(_ctx.stringValue("DescribeImageModifiedRecordsResponse.ImageModifiedRecords["+ i +"].ImageId"));

			imageModifiedRecords.add(imageModifiedRecord);
		}
		describeImageModifiedRecordsResponse.setImageModifiedRecords(imageModifiedRecords);
	 
	 	return describeImageModifiedRecordsResponse;
	}
}