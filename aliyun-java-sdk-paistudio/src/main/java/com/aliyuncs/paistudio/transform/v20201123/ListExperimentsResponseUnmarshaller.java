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

package com.aliyuncs.paistudio.transform.v20201123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.paistudio.model.v20201123.ListExperimentsResponse;
import com.aliyuncs.paistudio.model.v20201123.ListExperimentsResponse.Experiment;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListExperimentsResponseUnmarshaller {

	public static ListExperimentsResponse unmarshall(ListExperimentsResponse listExperimentsResponse, UnmarshallerContext _ctx) {
		
		listExperimentsResponse.setRequestId(_ctx.stringValue("ListExperimentsResponse.RequestId"));
		listExperimentsResponse.setCode(_ctx.stringValue("ListExperimentsResponse.Code"));
		listExperimentsResponse.setMessage(_ctx.stringValue("ListExperimentsResponse.Message"));
		listExperimentsResponse.setTotalCount(_ctx.integerValue("ListExperimentsResponse.TotalCount"));

		List<Experiment> data = new ArrayList<Experiment>();
		for (int i = 0; i < _ctx.lengthValue("ListExperimentsResponse.Data.Length"); i++) {
			Experiment experiment = new Experiment();
			experiment.setGmtCreate(_ctx.longValue("ListExperimentsResponse.Data["+ i +"].GmtCreate"));
			experiment.setGmtModified(_ctx.longValue("ListExperimentsResponse.Data["+ i +"].GmtModified"));
			experiment.setCreator(_ctx.stringValue("ListExperimentsResponse.Data["+ i +"].Creator"));
			experiment.setParentUserId(_ctx.stringValue("ListExperimentsResponse.Data["+ i +"].ParentUserId"));
			experiment.setWorkspaceId(_ctx.stringValue("ListExperimentsResponse.Data["+ i +"].WorkspaceId"));
			experiment.setExperimentId(_ctx.stringValue("ListExperimentsResponse.Data["+ i +"].ExperimentId"));
			experiment.setVersion(_ctx.longValue("ListExperimentsResponse.Data["+ i +"].Version"));
			experiment.setName(_ctx.stringValue("ListExperimentsResponse.Data["+ i +"].Name"));
			experiment.setDescription(_ctx.stringValue("ListExperimentsResponse.Data["+ i +"].Description"));
			experiment.setSource(_ctx.stringValue("ListExperimentsResponse.Data["+ i +"].Source"));

			data.add(experiment);
		}
		listExperimentsResponse.setData(data);
	 
	 	return listExperimentsResponse;
	}
}