/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.mts.transform.v20140618;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.PlayerAuthResponse;
import com.aliyuncs.mts.model.v20140618.PlayerAuthResponse._Switch;
import com.aliyuncs.transform.UnmarshallerContext;


public class PlayerAuthResponseUnmarshaller {

	public static PlayerAuthResponse unmarshall(PlayerAuthResponse playerAuthResponse, UnmarshallerContext context) {
		
		playerAuthResponse.setRequestId(context.stringValue("PlayerAuthResponse.RequestId"));
		playerAuthResponse.setLogURL(context.stringValue("PlayerAuthResponse.LogURL"));

		List<_Switch> switchList = new ArrayList<_Switch>();
		for (int i = 0; i < context.lengthValue("PlayerAuthResponse.SwitchList.Length"); i++) {
			_Switch _switch = new _Switch();
			_switch.setState(context.stringValue("PlayerAuthResponse.SwitchList["+ i +"].State"));
			_switch.setFunctionId(context.stringValue("PlayerAuthResponse.SwitchList["+ i +"].FunctionId"));
			_switch.setSwitchId(context.stringValue("PlayerAuthResponse.SwitchList["+ i +"].SwitchId"));
			_switch.setFunctionName(context.stringValue("PlayerAuthResponse.SwitchList["+ i +"].FunctionName"));

			switchList.add(_switch);
		}
		playerAuthResponse.setSwitchList(switchList);
	 
	 	return playerAuthResponse;
	}
}