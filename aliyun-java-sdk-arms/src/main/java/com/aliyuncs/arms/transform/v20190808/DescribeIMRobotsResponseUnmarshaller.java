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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.DescribeIMRobotsResponse;
import com.aliyuncs.arms.model.v20190808.DescribeIMRobotsResponse.PageBean;
import com.aliyuncs.arms.model.v20190808.DescribeIMRobotsResponse.PageBean.IMRobots;
import com.aliyuncs.arms.model.v20190808.DescribeIMRobotsResponse.PageBean.IMRobots.DispatchRule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIMRobotsResponseUnmarshaller {

	public static DescribeIMRobotsResponse unmarshall(DescribeIMRobotsResponse describeIMRobotsResponse, UnmarshallerContext _ctx) {
		
		describeIMRobotsResponse.setRequestId(_ctx.stringValue("DescribeIMRobotsResponse.RequestId"));

		PageBean pageBean = new PageBean();
		pageBean.setTotal(_ctx.longValue("DescribeIMRobotsResponse.PageBean.Total"));
		pageBean.setPage(_ctx.longValue("DescribeIMRobotsResponse.PageBean.Page"));
		pageBean.setSize(_ctx.longValue("DescribeIMRobotsResponse.PageBean.Size"));

		List<IMRobots> alertIMRobots = new ArrayList<IMRobots>();
		for (int i = 0; i < _ctx.lengthValue("DescribeIMRobotsResponse.PageBean.AlertIMRobots.Length"); i++) {
			IMRobots iMRobots = new IMRobots();
			iMRobots.setRobotId(_ctx.floatValue("DescribeIMRobotsResponse.PageBean.AlertIMRobots["+ i +"].RobotId"));
			iMRobots.setType(_ctx.stringValue("DescribeIMRobotsResponse.PageBean.AlertIMRobots["+ i +"].Type"));
			iMRobots.setRobotName(_ctx.stringValue("DescribeIMRobotsResponse.PageBean.AlertIMRobots["+ i +"].RobotName"));
			iMRobots.setRobotAddr(_ctx.stringValue("DescribeIMRobotsResponse.PageBean.AlertIMRobots["+ i +"].RobotAddr"));
			iMRobots.setDailyNoc(_ctx.booleanValue("DescribeIMRobotsResponse.PageBean.AlertIMRobots["+ i +"].DailyNoc"));
			iMRobots.setDailyNocTime(_ctx.stringValue("DescribeIMRobotsResponse.PageBean.AlertIMRobots["+ i +"].DailyNocTime"));
			iMRobots.setDingSignKey(_ctx.stringValue("DescribeIMRobotsResponse.PageBean.AlertIMRobots["+ i +"].DingSignKey"));
			iMRobots.setCreateTime(_ctx.stringValue("DescribeIMRobotsResponse.PageBean.AlertIMRobots["+ i +"].CreateTime"));

			List<DispatchRule> dispatchRules = new ArrayList<DispatchRule>();
			for (int j = 0; j < _ctx.lengthValue("DescribeIMRobotsResponse.PageBean.AlertIMRobots["+ i +"].DispatchRules.Length"); j++) {
				DispatchRule dispatchRule = new DispatchRule();
				dispatchRule.setId(_ctx.longValue("DescribeIMRobotsResponse.PageBean.AlertIMRobots["+ i +"].DispatchRules["+ j +"].id"));
				dispatchRule.setName(_ctx.stringValue("DescribeIMRobotsResponse.PageBean.AlertIMRobots["+ i +"].DispatchRules["+ j +"].name"));

				dispatchRules.add(dispatchRule);
			}
			iMRobots.setDispatchRules(dispatchRules);

			alertIMRobots.add(iMRobots);
		}
		pageBean.setAlertIMRobots(alertIMRobots);
		describeIMRobotsResponse.setPageBean(pageBean);
	 
	 	return describeIMRobotsResponse;
	}
}