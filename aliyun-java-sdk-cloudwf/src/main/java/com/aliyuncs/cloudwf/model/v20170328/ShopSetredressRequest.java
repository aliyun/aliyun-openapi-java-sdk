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

package com.aliyuncs.cloudwf.model.v20170328;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ShopSetredressRequest extends RpcAcsRequest<ShopSetredressResponse> {
	
	public ShopSetredressRequest() {
		super("cloudwf", "2017-03-28", "ShopSetredress", "cloudwf");
	}

	private String workday;

	private Integer filterclose;

	private Integer minstoptime;

	private String holiday;

	private String hnum;

	private Long sid;

	private Integer clerk;

	private Integer filterstate;

	private String wnum;

	private Integer state;

	private Integer crowdfixed;

	private Integer maxstoptime;

	public String getWorkday() {
		return this.workday;
	}

	public void setWorkday(String workday) {
		this.workday = workday;
		if(workday != null){
			putQueryParameter("Workday", workday);
		}
	}

	public Integer getFilterclose() {
		return this.filterclose;
	}

	public void setFilterclose(Integer filterclose) {
		this.filterclose = filterclose;
		if(filterclose != null){
			putQueryParameter("Filterclose", filterclose.toString());
		}
	}

	public Integer getMinstoptime() {
		return this.minstoptime;
	}

	public void setMinstoptime(Integer minstoptime) {
		this.minstoptime = minstoptime;
		if(minstoptime != null){
			putQueryParameter("Minstoptime", minstoptime.toString());
		}
	}

	public String getHoliday() {
		return this.holiday;
	}

	public void setHoliday(String holiday) {
		this.holiday = holiday;
		if(holiday != null){
			putQueryParameter("Holiday", holiday);
		}
	}

	public String getHnum() {
		return this.hnum;
	}

	public void setHnum(String hnum) {
		this.hnum = hnum;
		if(hnum != null){
			putQueryParameter("Hnum", hnum);
		}
	}

	public Long getSid() {
		return this.sid;
	}

	public void setSid(Long sid) {
		this.sid = sid;
		if(sid != null){
			putQueryParameter("Sid", sid.toString());
		}
	}

	public Integer getClerk() {
		return this.clerk;
	}

	public void setClerk(Integer clerk) {
		this.clerk = clerk;
		if(clerk != null){
			putQueryParameter("Clerk", clerk.toString());
		}
	}

	public Integer getFilterstate() {
		return this.filterstate;
	}

	public void setFilterstate(Integer filterstate) {
		this.filterstate = filterstate;
		if(filterstate != null){
			putQueryParameter("Filterstate", filterstate.toString());
		}
	}

	public String getWnum() {
		return this.wnum;
	}

	public void setWnum(String wnum) {
		this.wnum = wnum;
		if(wnum != null){
			putQueryParameter("Wnum", wnum);
		}
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
		if(state != null){
			putQueryParameter("State", state.toString());
		}
	}

	public Integer getCrowdfixed() {
		return this.crowdfixed;
	}

	public void setCrowdfixed(Integer crowdfixed) {
		this.crowdfixed = crowdfixed;
		if(crowdfixed != null){
			putQueryParameter("Crowdfixed", crowdfixed.toString());
		}
	}

	public Integer getMaxstoptime() {
		return this.maxstoptime;
	}

	public void setMaxstoptime(Integer maxstoptime) {
		this.maxstoptime = maxstoptime;
		if(maxstoptime != null){
			putQueryParameter("Maxstoptime", maxstoptime.toString());
		}
	}

	@Override
	public Class<ShopSetredressResponse> getResponseClass() {
		return ShopSetredressResponse.class;
	}

}
