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

import com.aliyuncs.ecd.model.v20200930.DescribeRecordingsResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeRecordingsResponse.Recording;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRecordingsResponseUnmarshaller {

	public static DescribeRecordingsResponse unmarshall(DescribeRecordingsResponse describeRecordingsResponse, UnmarshallerContext _ctx) {
		
		describeRecordingsResponse.setRequestId(_ctx.stringValue("DescribeRecordingsResponse.RequestId"));
		describeRecordingsResponse.setNextToken(_ctx.stringValue("DescribeRecordingsResponse.NextToken"));

		List<Recording> recordings = new ArrayList<Recording>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRecordingsResponse.Recordings.Length"); i++) {
			Recording recording = new Recording();
			recording.setEndTime(_ctx.stringValue("DescribeRecordingsResponse.Recordings["+ i +"].EndTime"));
			recording.setFilePath(_ctx.stringValue("DescribeRecordingsResponse.Recordings["+ i +"].FilePath"));
			recording.setStartTime(_ctx.stringValue("DescribeRecordingsResponse.Recordings["+ i +"].StartTime"));
			recording.setRecordingType(_ctx.stringValue("DescribeRecordingsResponse.Recordings["+ i +"].RecordingType"));
			recording.setRecordingSize(_ctx.integerValue("DescribeRecordingsResponse.Recordings["+ i +"].RecordingSize"));
			recording.setDesktopId(_ctx.stringValue("DescribeRecordingsResponse.Recordings["+ i +"].DesktopId"));

			List<String> endUserIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRecordingsResponse.Recordings["+ i +"].EndUserIds.Length"); j++) {
				endUserIds.add(_ctx.stringValue("DescribeRecordingsResponse.Recordings["+ i +"].EndUserIds["+ j +"]"));
			}
			recording.setEndUserIds(endUserIds);

			recordings.add(recording);
		}
		describeRecordingsResponse.setRecordings(recordings);
	 
	 	return describeRecordingsResponse;
	}
}