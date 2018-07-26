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

package com.aliyuncs.teslastream.transform.v20180115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.teslastream.model.v20180115.GetJobTopologyResponse;
import com.aliyuncs.teslastream.model.v20180115.GetJobTopologyResponse.Job;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetJobTopologyResponseUnmarshaller {

	public static GetJobTopologyResponse unmarshall(GetJobTopologyResponse getJobTopologyResponse, UnmarshallerContext context) {
		
		getJobTopologyResponse.setRequestId(context.stringValue("GetJobTopologyResponse.RequestId"));
		getJobTopologyResponse.setCode(context.integerValue("GetJobTopologyResponse.Code"));
		getJobTopologyResponse.setMessage(context.stringValue("GetJobTopologyResponse.Message"));

		List<Job> data = new ArrayList<Job>();
		for (int i = 0; i < context.lengthValue("GetJobTopologyResponse.Data.Length"); i++) {
			Job job = new Job();
			job.setText(context.stringValue("GetJobTopologyResponse.Data["+ i +"].Text"));
			job.setType(context.stringValue("GetJobTopologyResponse.Data["+ i +"].Type"));
			job.setPluginRelation(context.stringValue("GetJobTopologyResponse.Data["+ i +"].PluginRelation"));

			List<String> parents = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("GetJobTopologyResponse.Data["+ i +"].Parents.Length"); j++) {
				parents.add(context.stringValue("GetJobTopologyResponse.Data["+ i +"].Parents["+ j +"]"));
			}
			job.setParents(parents);

			List<String> childrens = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("GetJobTopologyResponse.Data["+ i +"].Childrens.Length"); j++) {
				childrens.add(context.stringValue("GetJobTopologyResponse.Data["+ i +"].Childrens["+ j +"]"));
			}
			job.setChildrens(childrens);

			data.add(job);
		}
		getJobTopologyResponse.setData(data);
	 
	 	return getJobTopologyResponse;
	}
}