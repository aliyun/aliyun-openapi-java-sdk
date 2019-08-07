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

package com.aliyuncs.webplus.transform.v20190320;

import com.aliyuncs.webplus.model.v20190320.DescribeChangeResponse;
import com.aliyuncs.webplus.model.v20190320.DescribeChangeResponse.Change;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeChangeResponseUnmarshaller {

	public static DescribeChangeResponse unmarshall(DescribeChangeResponse describeChangeResponse, UnmarshallerContext _ctx) {
		
		describeChangeResponse.setRequestId(_ctx.stringValue("DescribeChangeResponse.RequestId"));
		describeChangeResponse.setCode(_ctx.stringValue("DescribeChangeResponse.Code"));
		describeChangeResponse.setMessage(_ctx.stringValue("DescribeChangeResponse.Message"));

		Change change = new Change();
		change.setChangeId(_ctx.stringValue("DescribeChangeResponse.Change.ChangeId"));
		change.setEnvId(_ctx.stringValue("DescribeChangeResponse.Change.EnvId"));
		change.setChangeName(_ctx.stringValue("DescribeChangeResponse.Change.ChangeName"));
		change.setChangeDescription(_ctx.stringValue("DescribeChangeResponse.Change.ChangeDescription"));
		change.setChangeFinished(_ctx.booleanValue("DescribeChangeResponse.Change.ChangeFinished"));
		change.setChangeSucceed(_ctx.booleanValue("DescribeChangeResponse.Change.ChangeSucceed"));
		change.setChangeAborted(_ctx.booleanValue("DescribeChangeResponse.Change.ChangeAborted"));
		change.setChangePaused(_ctx.booleanValue("DescribeChangeResponse.Change.ChangePaused"));
		change.setChangeTimedout(_ctx.booleanValue("DescribeChangeResponse.Change.ChangeTimedout"));
		change.setCreateTime(_ctx.longValue("DescribeChangeResponse.Change.CreateTime"));
		change.setUpdateTime(_ctx.longValue("DescribeChangeResponse.Change.UpdateTime"));
		change.setFinishTime(_ctx.longValue("DescribeChangeResponse.Change.FinishTime"));
		change.setActionName(_ctx.stringValue("DescribeChangeResponse.Change.ActionName"));
		change.setCreateUsername(_ctx.stringValue("DescribeChangeResponse.Change.CreateUsername"));
		change.setChangeMessage(_ctx.stringValue("DescribeChangeResponse.Change.ChangeMessage"));
		describeChangeResponse.setChange(change);
	 
	 	return describeChangeResponse;
	}
}