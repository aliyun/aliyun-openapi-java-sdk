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

import com.aliyuncs.gpdb.model.v20160503.ListStreamingJobsResponse;
import com.aliyuncs.gpdb.model.v20160503.ListStreamingJobsResponse.Items;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListStreamingJobsResponseUnmarshaller {

	public static ListStreamingJobsResponse unmarshall(ListStreamingJobsResponse listStreamingJobsResponse, UnmarshallerContext _ctx) {
		
		listStreamingJobsResponse.setRequestId(_ctx.stringValue("ListStreamingJobsResponse.RequestId"));
		listStreamingJobsResponse.setTotalRecordCount(_ctx.integerValue("ListStreamingJobsResponse.TotalRecordCount"));
		listStreamingJobsResponse.setPageRecordCount(_ctx.integerValue("ListStreamingJobsResponse.PageRecordCount"));
		listStreamingJobsResponse.setPageNumber(_ctx.integerValue("ListStreamingJobsResponse.PageNumber"));

		List<Items> jobItems = new ArrayList<Items>();
		for (int i = 0; i < _ctx.lengthValue("ListStreamingJobsResponse.JobItems.Length"); i++) {
			Items items = new Items();
			items.setStatus(_ctx.stringValue("ListStreamingJobsResponse.JobItems["+ i +"].Status"));
			items.setAccount(_ctx.stringValue("ListStreamingJobsResponse.JobItems["+ i +"].Account"));
			items.setModifyTime(_ctx.stringValue("ListStreamingJobsResponse.JobItems["+ i +"].ModifyTime"));
			items.setDestSchema(_ctx.stringValue("ListStreamingJobsResponse.JobItems["+ i +"].DestSchema"));
			items.setMode(_ctx.stringValue("ListStreamingJobsResponse.JobItems["+ i +"].Mode"));
			items.setCreateTime(_ctx.stringValue("ListStreamingJobsResponse.JobItems["+ i +"].CreateTime"));
			items.setConsistency(_ctx.stringValue("ListStreamingJobsResponse.JobItems["+ i +"].Consistency"));
			items.setJobName(_ctx.stringValue("ListStreamingJobsResponse.JobItems["+ i +"].JobName"));
			items.setJobDescription(_ctx.stringValue("ListStreamingJobsResponse.JobItems["+ i +"].JobDescription"));
			items.setDestDatabase(_ctx.stringValue("ListStreamingJobsResponse.JobItems["+ i +"].DestDatabase"));
			items.setDataSourceName(_ctx.stringValue("ListStreamingJobsResponse.JobItems["+ i +"].DataSourceName"));
			items.setFallbackOffset(_ctx.stringValue("ListStreamingJobsResponse.JobItems["+ i +"].FallbackOffset"));
			items.setDestTable(_ctx.stringValue("ListStreamingJobsResponse.JobItems["+ i +"].DestTable"));
			items.setErrorMessage(_ctx.stringValue("ListStreamingJobsResponse.JobItems["+ i +"].ErrorMessage"));
			items.setJobId(_ctx.stringValue("ListStreamingJobsResponse.JobItems["+ i +"].JobId"));
			items.setDataSourceId(_ctx.stringValue("ListStreamingJobsResponse.JobItems["+ i +"].DataSourceId"));
			items.setWriteMode(_ctx.stringValue("ListStreamingJobsResponse.JobItems["+ i +"].WriteMode"));
			items.setPassword(_ctx.stringValue("ListStreamingJobsResponse.JobItems["+ i +"].Password"));

			List<String> updateColumns = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListStreamingJobsResponse.JobItems["+ i +"].UpdateColumns.Length"); j++) {
				updateColumns.add(_ctx.stringValue("ListStreamingJobsResponse.JobItems["+ i +"].UpdateColumns["+ j +"]"));
			}
			items.setUpdateColumns(updateColumns);

			List<String> srcColumns = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListStreamingJobsResponse.JobItems["+ i +"].SrcColumns.Length"); j++) {
				srcColumns.add(_ctx.stringValue("ListStreamingJobsResponse.JobItems["+ i +"].SrcColumns["+ j +"]"));
			}
			items.setSrcColumns(srcColumns);

			List<String> destColumns = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListStreamingJobsResponse.JobItems["+ i +"].DestColumns.Length"); j++) {
				destColumns.add(_ctx.stringValue("ListStreamingJobsResponse.JobItems["+ i +"].DestColumns["+ j +"]"));
			}
			items.setDestColumns(destColumns);

			List<String> matchColumns = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListStreamingJobsResponse.JobItems["+ i +"].MatchColumns.Length"); j++) {
				matchColumns.add(_ctx.stringValue("ListStreamingJobsResponse.JobItems["+ i +"].MatchColumns["+ j +"]"));
			}
			items.setMatchColumns(matchColumns);

			jobItems.add(items);
		}
		listStreamingJobsResponse.setJobItems(jobItems);
	 
	 	return listStreamingJobsResponse;
	}
}