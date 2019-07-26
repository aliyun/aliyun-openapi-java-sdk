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

package com.aliyuncs.cusanalytic_sc_online.model.v20190524;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cusanalytic_sc_online.transform.v20190524.GetPortrayalResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPortrayalResponse extends AcsResponse {

	private Float femalePercent;

	private Long mcount;

	private Long mcount1120;

	private Long newcount;

	private Float agecount3140Percent;

	private Float agecount4150Percent;

	private Float agecount010Percent;

	private Long fcount5160;

	private Long mcount010;

	private Long mcountgt60;

	private Float agecount1120Percent;

	private Long fcountgt60;

	private Long fcount4150;

	private Long oldcount;

	private Long fcount3140;

	private Long fcount2130;

	private Float agecountgt60Percent;

	private Long fcount1120;

	private Float oldcountPercent;

	private Long mcount4150;

	private Long fcount;

	private Float newcountPercent;

	private Long mcount2130;

	private Long mcount3140;

	private Float agecount5160Percent;

	private Float agecount2130Percent;

	private Long fcount010;

	private Long mcount5160;

	private Float malePercent;

	public Float getFemalePercent() {
		return this.femalePercent;
	}

	public void setFemalePercent(Float femalePercent) {
		this.femalePercent = femalePercent;
	}

	public Long getMcount() {
		return this.mcount;
	}

	public void setMcount(Long mcount) {
		this.mcount = mcount;
	}

	public Long getMcount1120() {
		return this.mcount1120;
	}

	public void setMcount1120(Long mcount1120) {
		this.mcount1120 = mcount1120;
	}

	public Long getNewcount() {
		return this.newcount;
	}

	public void setNewcount(Long newcount) {
		this.newcount = newcount;
	}

	public Float getAgecount3140Percent() {
		return this.agecount3140Percent;
	}

	public void setAgecount3140Percent(Float agecount3140Percent) {
		this.agecount3140Percent = agecount3140Percent;
	}

	public Float getAgecount4150Percent() {
		return this.agecount4150Percent;
	}

	public void setAgecount4150Percent(Float agecount4150Percent) {
		this.agecount4150Percent = agecount4150Percent;
	}

	public Float getAgecount010Percent() {
		return this.agecount010Percent;
	}

	public void setAgecount010Percent(Float agecount010Percent) {
		this.agecount010Percent = agecount010Percent;
	}

	public Long getFcount5160() {
		return this.fcount5160;
	}

	public void setFcount5160(Long fcount5160) {
		this.fcount5160 = fcount5160;
	}

	public Long getMcount010() {
		return this.mcount010;
	}

	public void setMcount010(Long mcount010) {
		this.mcount010 = mcount010;
	}

	public Long getMcountgt60() {
		return this.mcountgt60;
	}

	public void setMcountgt60(Long mcountgt60) {
		this.mcountgt60 = mcountgt60;
	}

	public Float getAgecount1120Percent() {
		return this.agecount1120Percent;
	}

	public void setAgecount1120Percent(Float agecount1120Percent) {
		this.agecount1120Percent = agecount1120Percent;
	}

	public Long getFcountgt60() {
		return this.fcountgt60;
	}

	public void setFcountgt60(Long fcountgt60) {
		this.fcountgt60 = fcountgt60;
	}

	public Long getFcount4150() {
		return this.fcount4150;
	}

	public void setFcount4150(Long fcount4150) {
		this.fcount4150 = fcount4150;
	}

	public Long getOldcount() {
		return this.oldcount;
	}

	public void setOldcount(Long oldcount) {
		this.oldcount = oldcount;
	}

	public Long getFcount3140() {
		return this.fcount3140;
	}

	public void setFcount3140(Long fcount3140) {
		this.fcount3140 = fcount3140;
	}

	public Long getFcount2130() {
		return this.fcount2130;
	}

	public void setFcount2130(Long fcount2130) {
		this.fcount2130 = fcount2130;
	}

	public Float getAgecountgt60Percent() {
		return this.agecountgt60Percent;
	}

	public void setAgecountgt60Percent(Float agecountgt60Percent) {
		this.agecountgt60Percent = agecountgt60Percent;
	}

	public Long getFcount1120() {
		return this.fcount1120;
	}

	public void setFcount1120(Long fcount1120) {
		this.fcount1120 = fcount1120;
	}

	public Float getOldcountPercent() {
		return this.oldcountPercent;
	}

	public void setOldcountPercent(Float oldcountPercent) {
		this.oldcountPercent = oldcountPercent;
	}

	public Long getMcount4150() {
		return this.mcount4150;
	}

	public void setMcount4150(Long mcount4150) {
		this.mcount4150 = mcount4150;
	}

	public Long getFcount() {
		return this.fcount;
	}

	public void setFcount(Long fcount) {
		this.fcount = fcount;
	}

	public Float getNewcountPercent() {
		return this.newcountPercent;
	}

	public void setNewcountPercent(Float newcountPercent) {
		this.newcountPercent = newcountPercent;
	}

	public Long getMcount2130() {
		return this.mcount2130;
	}

	public void setMcount2130(Long mcount2130) {
		this.mcount2130 = mcount2130;
	}

	public Long getMcount3140() {
		return this.mcount3140;
	}

	public void setMcount3140(Long mcount3140) {
		this.mcount3140 = mcount3140;
	}

	public Float getAgecount5160Percent() {
		return this.agecount5160Percent;
	}

	public void setAgecount5160Percent(Float agecount5160Percent) {
		this.agecount5160Percent = agecount5160Percent;
	}

	public Float getAgecount2130Percent() {
		return this.agecount2130Percent;
	}

	public void setAgecount2130Percent(Float agecount2130Percent) {
		this.agecount2130Percent = agecount2130Percent;
	}

	public Long getFcount010() {
		return this.fcount010;
	}

	public void setFcount010(Long fcount010) {
		this.fcount010 = fcount010;
	}

	public Long getMcount5160() {
		return this.mcount5160;
	}

	public void setMcount5160(Long mcount5160) {
		this.mcount5160 = mcount5160;
	}

	public Float getMalePercent() {
		return this.malePercent;
	}

	public void setMalePercent(Float malePercent) {
		this.malePercent = malePercent;
	}

	@Override
	public GetPortrayalResponse getInstance(UnmarshallerContext context) {
		return	GetPortrayalResponseUnmarshaller.unmarshall(this, context);
	}
}
