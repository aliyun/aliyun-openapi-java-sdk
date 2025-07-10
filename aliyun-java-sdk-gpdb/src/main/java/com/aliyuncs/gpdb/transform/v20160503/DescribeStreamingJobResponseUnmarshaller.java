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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.DescribeStreamingJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStreamingJobResponseUnmarshaller {

	public static DescribeStreamingJobResponse unmarshall(DescribeStreamingJobResponse describeStreamingJobResponse, UnmarshallerContext _ctx) {
		
		describeStreamingJobResponse.setRequestId(_ctx.stringValue("DescribeStreamingJobResponse.RequestId"));
		describeStreamingJobResponse.setJobId(_ctx.stringValue("DescribeStreamingJobResponse.JobId"));
		describeStreamingJobResponse.setJobName(_ctx.stringValue("DescribeStreamingJobResponse.JobName"));
		describeStreamingJobResponse.setJobDescription(_ctx.stringValue("DescribeStreamingJobResponse.JobDescription"));
		describeStreamingJobResponse.setDataSourceId(_ctx.stringValue("DescribeStreamingJobResponse.DataSourceId"));
		describeStreamingJobResponse.setAccount(_ctx.stringValue("DescribeStreamingJobResponse.Account"));
		describeStreamingJobResponse.setPassword(_ctx.stringValue("DescribeStreamingJobResponse.Password"));
		describeStreamingJobResponse.setDestDatabase(_ctx.stringValue("DescribeStreamingJobResponse.DestDatabase"));
		describeStreamingJobResponse.setDestSchema(_ctx.stringValue("DescribeStreamingJobResponse.DestSchema"));
		describeStreamingJobResponse.setDestTable(_ctx.stringValue("DescribeStreamingJobResponse.DestTable"));
		describeStreamingJobResponse.setWriteMode(_ctx.stringValue("DescribeStreamingJobResponse.WriteMode"));
		describeStreamingJobResponse.setMode(_ctx.stringValue("DescribeStreamingJobResponse.Mode"));
		describeStreamingJobResponse.setJobConfig(_ctx.stringValue("DescribeStreamingJobResponse.JobConfig"));
		describeStreamingJobResponse.setStatus(_ctx.stringValue("DescribeStreamingJobResponse.Status"));
		describeStreamingJobResponse.setErrorMessage(_ctx.stringValue("DescribeStreamingJobResponse.ErrorMessage"));
		describeStreamingJobResponse.setCreateTime(_ctx.stringValue("DescribeStreamingJobResponse.CreateTime"));
		describeStreamingJobResponse.setModifyTime(_ctx.stringValue("DescribeStreamingJobResponse.ModifyTime"));
		describeStreamingJobResponse.setGroupName(_ctx.stringValue("DescribeStreamingJobResponse.GroupName"));
		describeStreamingJobResponse.setConsistency(_ctx.stringValue("DescribeStreamingJobResponse.Consistency"));
		describeStreamingJobResponse.setErrorLimitCount(_ctx.integerValue("DescribeStreamingJobResponse.ErrorLimitCount"));
		describeStreamingJobResponse.setFallbackOffset(_ctx.stringValue("DescribeStreamingJobResponse.FallbackOffset"));
		describeStreamingJobResponse.setDataSourceName(_ctx.stringValue("DescribeStreamingJobResponse.DataSourceName"));

		List<String> srcColumns = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeStreamingJobResponse.SrcColumns.Length"); i++) {
			srcColumns.add(_ctx.stringValue("DescribeStreamingJobResponse.SrcColumns["+ i +"]"));
		}
		describeStreamingJobResponse.setSrcColumns(srcColumns);

		List<String> destColumns = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeStreamingJobResponse.DestColumns.Length"); i++) {
			destColumns.add(_ctx.stringValue("DescribeStreamingJobResponse.DestColumns["+ i +"]"));
		}
		describeStreamingJobResponse.setDestColumns(destColumns);

		List<String> matchColumns = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeStreamingJobResponse.MatchColumns.Length"); i++) {
			matchColumns.add(_ctx.stringValue("DescribeStreamingJobResponse.MatchColumns["+ i +"]"));
		}
		describeStreamingJobResponse.setMatchColumns(matchColumns);

		List<String> updateColumns = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeStreamingJobResponse.UpdateColumns.Length"); i++) {
			updateColumns.add(_ctx.stringValue("DescribeStreamingJobResponse.UpdateColumns["+ i +"]"));
		}
		describeStreamingJobResponse.setUpdateColumns(updateColumns);
	 
	 	return describeStreamingJobResponse;
	}
}